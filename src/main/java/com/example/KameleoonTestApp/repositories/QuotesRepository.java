package com.example.KameleoonTestApp.repositories;

import com.example.KameleoonTestApp.models.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quotes, Long> {
}
