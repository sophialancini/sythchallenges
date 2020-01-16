/*
 * This file is generated by jOOQ.
 */
package com.jooqspringboot.jooqspringbootproject.jooq.tables.daos;


import com.jooqspringboot.jooqspringbootproject.jooq.tables.Author;
import com.jooqspringboot.jooqspringbootproject.jooq.tables.records.AuthorRecord;

import java.time.LocalDate;
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
public class AuthorDao extends DAOImpl<AuthorRecord, com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author, Integer> {

    /**
     * Create a new AuthorDao without any configuration
     */
    public AuthorDao() {
        super(Author.AUTHOR, com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author.class);
    }

    /**
     * Create a new AuthorDao with an attached configuration
     */
    public AuthorDao(Configuration configuration) {
        super(Author.AUTHOR, com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author.class, configuration);
    }

    @Override
    public Integer getId(com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author object) {
        return object.getIdauthor();
    }

    /**
     * Fetch records that have <code>idauthor BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchRangeOfIdauthor(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Author.AUTHOR.IDAUTHOR, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>idauthor IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchByIdauthor(Integer... values) {
        return fetch(Author.AUTHOR.IDAUTHOR, values);
    }

    /**
     * Fetch a unique record that has <code>idauthor = value</code>
     */
    public com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author fetchOneByIdauthor(Integer value) {
        return fetchOne(Author.AUTHOR.IDAUTHOR, value);
    }

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchRangeOfFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Author.AUTHOR.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchByFirstName(String... values) {
        return fetch(Author.AUTHOR.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchRangeOfLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Author.AUTHOR.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchByLastName(String... values) {
        return fetch(Author.AUTHOR.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>date_of_birth BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchRangeOfDateOfBirth(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(Author.AUTHOR.DATE_OF_BIRTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>date_of_birth IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchByDateOfBirth(LocalDate... values) {
        return fetch(Author.AUTHOR.DATE_OF_BIRTH, values);
    }

    /**
     * Fetch records that have <code>distinguished BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchRangeOfDistinguished(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(Author.AUTHOR.DISTINGUISHED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>distinguished IN (values)</code>
     */
    public List<com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos.Author> fetchByDistinguished(Byte... values) {
        return fetch(Author.AUTHOR.DISTINGUISHED, values);
    }
}
