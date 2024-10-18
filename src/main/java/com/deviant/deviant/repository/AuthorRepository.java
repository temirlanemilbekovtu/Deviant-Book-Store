package com.deviant.deviant.repository;

import com.deviant.deviant.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByFullNameContaining(String fullName);
    List<Author> findByBooksTitleContaining(String booksTitle);
}
