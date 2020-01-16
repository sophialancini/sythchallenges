/*
 * This file is generated by jOOQ.
 */
package com.jooqspringboot.jooqspringbootproject.jooq.tables.daos;


import com.jooqspringboot.jooqspringbootproject.jooq.tables.Book;
import com.jooqspringboot.jooqspringbootproject.jooq.tables.records.BookRecord;

import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookDao extends DAOImpl<BookRecord, com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book, Integer> {

    /**
     * Create a new BookDao without any configuration
     */
    public BookDao() {
        super(Book.BOOK, com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book.class);
    }

    /**
     * Create a new BookDao with an attached configuration
     */
    public BookDao(Configuration configuration) {
        super(Book.BOOK, com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book.class, configuration);
    }

    @Override
    public Integer getId(com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book object) {
        return object.getIdbook();
    }

    /**
     * Fetch records that have <code>idbook BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchRangeOfIdbook(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.IDBOOK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>idbook IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchByIdbook(Integer... values) {
        return fetch(Book.BOOK.IDBOOK, values);
    }

    /**
     * Fetch a unique record that has <code>idbook = value</code>
     */
    public com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book fetchOneByIdbook(Integer value) {
        return fetchOne(Book.BOOK.IDBOOK, value);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchByTitle(String... values) {
        return fetch(Book.BOOK.TITLE, values);
    }

    /**
     * Fetch records that have <code>publisher_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchRangeOfPublisherName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.PUBLISHER_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>publisher_name IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchByPublisherName(String... values) {
        return fetch(Book.BOOK.PUBLISHER_NAME, values);
    }

    /**
     * Fetch records that have <code>publish_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchRangeOfPublishDate(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.PUBLISH_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>publish_date IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchByPublishDate(String... values) {
        return fetch(Book.BOOK.PUBLISH_DATE, values);
    }

    /**
     * Fetch records that have <code>language BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchRangeOfLanguage(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.LANGUAGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>language IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Book> fetchByLanguage(String... values) {
        return fetch(Book.BOOK.LANGUAGE, values);
    }
}