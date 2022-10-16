package com.utcn.oop;

import java.util.Objects;

public class Book {
    String name;
    String author;
    String publisher;
    Float price;

    // empty constructor build GENERIC object
    // constructor with parameters build objects with more specific information.
    public Book() {
    }

    public Book(String name, String author, String publisher, Float price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublisher(), book.getPublisher()) && Objects.equals(getPrice(), book.getPrice());
    }
}
