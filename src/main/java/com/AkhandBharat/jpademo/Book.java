package com.AkhandBharat.jpademo;

import jakarta.persistence.*;

public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int bookId;
    private String title;
    private int price;

    @ManyToOne
    @JoinColumn
    Author author;

    public Book(){

    }

    public Book(int bookId, String title, int price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
