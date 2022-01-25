package com.poc.service.metier;

import com.poc.domain.Candidate;

import java.util.List;

public interface CandidateSM {
    Candidate add(Candidate candidate);

    List<Candidate> getAll();

    Candidate getById(String id);

    Candidate update(String id, Candidate candidate);

    void delete(String id);

    Candidate findByEmail(String email);

    List<Candidate> searchByExp(Double expFrom, Double expTo);
}
