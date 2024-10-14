package com.deviant.deviant.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class WishlistId implements Serializable {
    private Long readerId;
    private Long bookId;

    public WishlistId() {}

    public WishlistId(Long readerId, Long bookId) {
        this.readerId = readerId;
        this.bookId = bookId;
    }

    public Long getReaderId() {
        return readerId;
    }

    public void setReaderId(Long readerId) {
        this.readerId = readerId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WishlistId that = (WishlistId) o;

        if (!readerId.equals(that.readerId)) return false;
        return bookId.equals(that.bookId);
    }

    @Override
    public int hashCode() {
        return 31 * readerId.hashCode() + bookId.hashCode();
    }
}
