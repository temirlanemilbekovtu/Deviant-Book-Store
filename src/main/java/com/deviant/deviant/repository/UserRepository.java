package com.deviant.deviant.repository;

import com.deviant.deviant.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContaining(String email);
    User findByName(String name);
    User findByEmail(String email);
}
