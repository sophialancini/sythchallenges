package com.bookmanagement.bookmanagement.controller;

import com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author;
import com.jooqspringboot.jooqspringbootproject.jooq.tables.daos.AuthorDao;
import com.jooqspringboot.jooqspringbootproject.jooq.tables.records.AuthorRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SelectWhereStep;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static com.jooqspringboot.jooqspringbootproject.jooq.tables.Author.AUTHOR;

@RestController
public class MngAuthorEndpoint {
    private final String endpoint = "/authors";
    private final AuthorDao authorDao;
    private final DSLContext dsl;

    public MngAuthorEndpoint(DSLContext dsl, Configuration jooqConfiguration) {
        this.authorDao = new AuthorDao(jooqConfiguration);
        this.dsl = dsl;
    }

    @GetMapping(endpoint+"/listAll")
    public List<Author> listAll() {
        return this.authorDao.findAll();
    }

    @GetMapping(endpoint+"/get/authorid={id}")
    public Author getAuthorById(@PathVariable("id") int id) {
        return this.authorDao.fetchOneByIdauthor(id);
    }

    @GetMapping(endpoint+"/delete/{id}")
    public String deleteAuthor(@PathVariable("id") int id) {
        this.authorDao.deleteById(id);
        return "Author " + id + " deleted.";
    }

    @PutMapping(endpoint+"/create")
    public String createAuthor(@RequestBody Author newAuthor) {
        dsl.execute(String.format("INSERT INTO AUTHOR(FIRST_NAME, LAST_NAME, DATE_OF_BIRTH, DISTINGUISHED) " +
                        "VALUES(\"%s\", \"%s\", \"%s\", %b)",
                newAuthor.getFirstName(), newAuthor.getLastName(), newAuthor.getDateOfBirth(),
                newAuthor.getDistinguished()));
        return "New author created.";
    }

    @PutMapping(endpoint+"/update/{id}")
    public String updateAuthor(@PathVariable("id") int id, @RequestBody Author newAuthor) {
        dsl.execute(String.format("UPDATE AUTHOR " +
                        "SET FIRST_NAME = \"%s\", LAST_NAME = \"%s\", DATE_OF_BIRTH = \"%s\", DISTINGUISHED = %b " +
                        "WHERE ID = %d",
                newAuthor.getFirstName(), newAuthor.getLastName(), newAuthor.getDateOfBirth(),
                newAuthor.getDistinguished(), id));
        return "Author " + id + " updated.";
    }
}

