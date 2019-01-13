package com.netcracker.students.BatyrkinAndrew.autowiring;

import com.netcracker.students.BatyrkinAndrew.SpEL.Author;

public class Book {
    private String name;
    private Author author;

    public Book() {
        System.out.println("Book.Book SMALL Constr");
    }

    public Book(String name, Author author) {
        System.out.println("Book.Book");
        this.name = name;
        this.author = author;
        System.out.println("name = [" + name + "], author = [" + author + "]");
    }

    public String getName() {
        System.out.println("Book.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("Book.setName");
        this.name = name;
    }

    public Author getAuthor() {
        System.out.println("Book.getAuthor");
        return author;
    }

    public void setAuthor(Author author) {
        System.out.println("Book.setAuthor");
        this.author = author;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", author = " + author;
    }
}
