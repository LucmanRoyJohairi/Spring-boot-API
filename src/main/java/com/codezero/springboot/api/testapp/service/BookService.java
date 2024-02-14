package com.codezero.springboot.api.testapp.service;

import com.codezero.springboot.api.testapp.entity.Book;
import com.codezero.springboot.api.testapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        List<Book> books = bookRepository.findAll();
        System.out.println("retrieved books: " + books);
        return bookRepository.findAll();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book update(Long bookId, Book updatedBook){
        Book matchingBook = bookRepository.findById(bookId).orElse(null);
        if(matchingBook != null){
            matchingBook.setTitle(updatedBook.getTitle());
            matchingBook.setContent(updatedBook.getContent());

            bookRepository.save(matchingBook);
        }

        return matchingBook;

    }

    public void delete(Long bookId){
        System.out.println("book has been deleted" + bookId);
        bookRepository.deleteById(bookId);
    }


}