package com.example.KameleoonTestApp.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "quotes")
public class Quote {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "content")
    private String content;

    @Column(name = "dateOfCreation")
    private String dateOfCreation;

    @Column(name = "author")
    private String author;

//    @OneToMany
//    @JoinColumn(name = "user_id")
//    private List<Vote> votesList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
