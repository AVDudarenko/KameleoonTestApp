package com.example.KameleoonTestApp.repositories;

import com.example.KameleoonTestApp.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotesRepository extends JpaRepository<Vote, Long> {
}
