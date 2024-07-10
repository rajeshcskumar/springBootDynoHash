package com.devtiro.postgre.dao;

import com.devtiro.postgre.domain.Author;

import java.util.Optional;

public interface  AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);
}
