package com.example.KameleoonTestApp.services;

import com.example.KameleoonTestApp.repositories.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    private final QuotesRepository quotesRepository;

    @Autowired
    public QuoteService(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }
}
