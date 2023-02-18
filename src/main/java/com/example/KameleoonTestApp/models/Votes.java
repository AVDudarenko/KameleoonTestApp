package com.example.KameleoonTestApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "votes")
public class Votes {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "votes")
    private long votes;

}
