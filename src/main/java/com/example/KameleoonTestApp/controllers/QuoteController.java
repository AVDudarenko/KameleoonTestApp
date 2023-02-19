package com.example.KameleoonTestApp.controllers;

import com.example.KameleoonTestApp.models.Quote;
import com.example.KameleoonTestApp.repositories.QuotesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuoteController {
    private final QuotesRepository quotesRepository;

    public QuoteController(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    @GetMapping
    Iterable<Quote> getEvents() {
        return quotesRepository.findAll();
    }

    @PostMapping
    Quote postEvent(@RequestBody Quote event) {
        return quotesRepository.save(event);
    }

    @PutMapping("/{id}")
    ResponseEntity<Quote> putEvent(@PathVariable Long id,
                                   @RequestBody Quote event) {
        return (!quotesRepository.existsById(id))
                ? new ResponseEntity<>(quotesRepository.save(event),
                HttpStatus.CREATED)
                : new ResponseEntity<>(quotesRepository.save(event), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteEvent(@PathVariable Long id) {
        quotesRepository.deleteById(id);
    }
}
