package com.deviant.deviant.model;

import jakarta.persistence.*;

@Entity
public class Wishlist {
    @EmbeddedId
    private WishlistId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("readerId")
    @JoinColumn(name = "id", nullable = false)
    private Reader reader;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("bookId")
    @JoinColumn(name = "id", nullable = false)
    private Book book;

    public Wishlist() {}

    public Wishlist(Reader reader, Book book) {
        this.reader = reader;
        this.book = book;
        id = new WishlistId(reader.getUser().getId(), book.getId());
    }

    public WishlistId getId() {
        return id;
    }

    public void setId(WishlistId id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
