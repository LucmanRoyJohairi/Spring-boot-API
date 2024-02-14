package com.codezero.springboot.api.testapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
//    for making post request | adding to db
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String title;
    private String content;

    // standard constructors

    // standard getters and setters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


    // Setters for each field
//    public void setId(Long id) {
//        this.id = id;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content +
                '}';
    }
}