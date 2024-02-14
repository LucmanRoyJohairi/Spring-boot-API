package com.codezero.springboot.api.testapp.service;

import com.codezero.springboot.api.testapp.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> list();
    Book save(Book book);
    Book update(Long bookId, Book updatedBook);
    void delete(Long bookId);
}
