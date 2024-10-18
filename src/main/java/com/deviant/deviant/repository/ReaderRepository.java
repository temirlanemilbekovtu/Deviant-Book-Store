package com.deviant.deviant.repository;

import com.deviant.deviant.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
    List<Reader> findByUserName(String username);
    List<Reader> findByUserEmail(String email);
}
