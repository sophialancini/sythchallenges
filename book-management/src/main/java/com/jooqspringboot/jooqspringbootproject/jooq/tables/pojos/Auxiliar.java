/*
 * This file is generated by jOOQ.
 */
package com.jooqspringboot.jooqspringbootproject.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


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
public class Auxiliar implements Serializable {

    private static final long serialVersionUID = 1409223555;

    private Integer authorId;
    private Integer bookId;
    private Integer auxid;

    public Auxiliar() {}

    public Auxiliar(Auxiliar value) {
        this.authorId = value.authorId;
        this.bookId = value.bookId;
        this.auxid = value.auxid;
    }

    public Auxiliar(
        Integer authorId,
        Integer bookId,
        Integer auxid
    ) {
        this.authorId = authorId;
        this.bookId = bookId;
        this.auxid = auxid;
    }

    public Integer getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getAuxid() {
        return this.auxid;
    }

    public void setAuxid(Integer auxid) {
        this.auxid = auxid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Auxiliar other = (Auxiliar) obj;
        if (authorId == null) {
            if (other.authorId != null)
                return false;
        }
        else if (!authorId.equals(other.authorId))
            return false;
        if (bookId == null) {
            if (other.bookId != null)
                return false;
        }
        else if (!bookId.equals(other.bookId))
            return false;
        if (auxid == null) {
            if (other.auxid != null)
                return false;
        }
        else if (!auxid.equals(other.auxid))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.authorId == null) ? 0 : this.authorId.hashCode());
        result = prime * result + ((this.bookId == null) ? 0 : this.bookId.hashCode());
        result = prime * result + ((this.auxid == null) ? 0 : this.auxid.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Auxiliar (");

        sb.append(authorId);
        sb.append(", ").append(bookId);
        sb.append(", ").append(auxid);

        sb.append(")");
        return sb.toString();
    }
}