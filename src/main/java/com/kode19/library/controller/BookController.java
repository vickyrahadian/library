package com.kode19.library.controller;

import com.kode19.library.model.Book;
import com.kode19.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;
    private List<Book> books;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
        this.books = new ArrayList<>();
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBook() {
        books = bookService.getAllBook();

        if(books.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        bookService.createBook(book);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}
