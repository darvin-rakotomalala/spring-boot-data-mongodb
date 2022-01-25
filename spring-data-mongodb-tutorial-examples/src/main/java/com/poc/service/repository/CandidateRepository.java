package com.poc.service.repository;

import com.poc.domain.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends MongoRepository<Candidate, String> {

    // Start - Méthodes de requête personnalisées
    Optional<Candidate> findByEmail(String email);

    List<Candidate> findByExpGreaterThanEqual(double exp);

    List<Candidate> findByExpBetween(double from, double to);
    // End
}
