package com.deviant.deviant.repository;

import com.deviant.deviant.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorsFullNameContaining(String author);
    List<Book> findByTitleContaining(String title);
    List<Book> findByGenre(String genre);
    List<Book> findByPriceLessThan(Double price);
    List<Book> findByPriceGreaterThan(Double price);
    List<Book> findByPriceBetween(Double lower, Double higher);
    List<Book> findByIsbn(String isbn);
}