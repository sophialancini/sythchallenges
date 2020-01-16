package com.bookmanagement.bookmanagement.controller;

import com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book;
import com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book;
import org.hibernate.query.criteria.internal.expression.ConcatExpression;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.jooqspringboot.jooqspringbootproject.jooq.Tables.*;
import static org.jooq.impl.DSL.*;

@RestController
public class MngBookEndpoint {
    private final String endpoint = "/books";
    private final DSLContext dsl;
    private int authorId;
    private int bookId;


    @Autowired
    public MngBookEndpoint(DSLContext dsl) {
        this.dsl = dsl;
    }

    @GetMapping(endpoint+"/get/bookid={id}")
    public Book getBookById(@PathVariable("id") int id) {
        return dsl.select().from(BOOK).where(BOOK.IDBOOK.eq(id)).fetchOne().into(Book.class);
    }

    @GetMapping(endpoint+"/listAll")
    public List<Book> listAll() {
        return dsl.select().from(BOOK).fetch().into(Book.class) ;
    }

    @GetMapping(endpoint+"/get/authorid={id}")
    public List<Book> getBooksByAuthorId(@PathVariable("id") int id) {
        Result<Record> result = dsl.select().from(AUXILIAR.join(BOOK).on(AUXILIAR.BOOK_ID.eq(BOOK.IDBOOK)))
                .where(AUXILIAR.AUTHOR_ID.equal(id)).fetch();
        List<Book> list = result.into(Book.class);
        return list;
    }

    @PutMapping(endpoint+"/create")
    public String createBook(@RequestBody Book newBook) {
        dsl.execute(String.format("INSERT INTO BOOK(TITLE, PUBLISHER_NAME, PUBLISH_DATE, LANGUAGE) " +
                        "VALUES(\"%s\", \"%s\", \"%s\", \"%s\")",
                newBook.getTitle(), newBook.getPublisherName(), newBook.getPublishDate(),
                newBook.getLanguage()));
        authorId = dsl.select(AUTHOR.IDAUTHOR).from(AUTHOR)
                .where(concat(AUTHOR.FIRST_NAME, val(" "), AUTHOR.LAST_NAME).eq(newBook.getPublisherName()))
                .fetchOne().into(int.class);
        bookId = dsl.select(max(BOOK.IDBOOK)).from(BOOK).fetchOne().into(int.class);
        dsl.execute(String.format("INSERT INTO AUXILIAR(AUTHOR_ID, BOOK_ID) VALUES(%d, %d)", authorId, bookId));
        return "New book created.";
    }

    @PutMapping(endpoint+"/update/{id}")
    public String updateBook(@PathVariable("id") int id, @RequestBody Book newBook) {
        dsl.execute(String.format("UPDATE BOOK " +
                        "SET TITLE = \"%s\", PUBLISHER_NAME = \"%s\", PUBLISH_DATE = \"%s\", LANGUAGE = \"%s\" " +
                        "WHERE IDBOOK = %d",
                newBook.getTitle(), newBook.getPublisherName(), newBook.getPublishDate(),
                newBook.getLanguage(), id));
        return "Book " + id + " updated.";
    }

    @GetMapping(endpoint+"/delete/{id}")
    public String deleteAuthor(@PathVariable("id") int id) {
        dsl.execute(String.format("DELETE FROM BOOK WHERE IDBOOK = %d"), id);
        dsl.execute(String.format("DELETE FROM AUXILIAR WHERE BOOK_ID = %d"), id);
        return "Book " + id + " deleted.";
    }

}
