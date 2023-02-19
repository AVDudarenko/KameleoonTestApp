package com.example.KameleoonTestApp.services;

import com.example.KameleoonTestApp.repositories.VotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    private final VotesRepository votesRepository;

    @Autowired
    public VoteService(VotesRepository votesRepository) {
        this.votesRepository = votesRepository;
    }
}
