package com.devtiro.postgre.dao;

import com.devtiro.postgre.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> find(String isbn);
}
