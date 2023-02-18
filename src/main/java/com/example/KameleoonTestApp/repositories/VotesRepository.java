package com.example.KameleoonTestApp.repositories;

import com.example.KameleoonTestApp.models.Votes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotesRepository extends JpaRepository<Votes, Long> {
}
