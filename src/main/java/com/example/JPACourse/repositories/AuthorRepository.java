package com.example.JPACourse.repositories;

import com.example.JPACourse.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findAllByFirstNameLikeAndAgeGreaterThanEqual(String firstName, Integer age);
}
