package com.kode19.library.model;

import javax.persistence.*;

@Entity
@Table
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long idBook;
    private String title;
    private String ISBN;

    public Book() {
    }

    public Book(Long idBook, String title, String ISBN) {
        this.idBook = idBook;
        this.title = title;
        this.ISBN = ISBN;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
