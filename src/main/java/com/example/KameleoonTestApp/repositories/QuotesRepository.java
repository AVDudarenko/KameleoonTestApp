package com.example.KameleoonTestApp.repositories;

import com.example.KameleoonTestApp.models.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quote, Long> {
}
