package com.example.KameleoonTestApp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "username must not be null")
    @Size(min = 3, max = 100, message = "username must be from 3 to 100 symbols")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "password must not be null")
    @Size(min = 3, max = 100, message = "password must be from 3 to 100 symbols")
    @Column(name = "password")
    private String password;

    @Column(name = "dateOfCreation")
    private String dateOfCreation;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Quote> quoteList;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                '}';
    }
}
