package com.codezero.springboot.api.testapp.controller;

import com.codezero.springboot.api.testapp.entity.Book;
import com.codezero.springboot.api.testapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.list();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        System.out.println("payload: 🔥🔥🔥" + book);

        return bookService.save(book);
    }


    @PutMapping("/{bookId}")
    public  Book updateBook(@PathVariable Long bookId, @RequestBody Book updatedBook){
        return bookService.update(bookId, updatedBook);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable Long bookId){
        bookService.delete(bookId);
    }
}
