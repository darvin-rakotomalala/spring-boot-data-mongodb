package com.poc.service.metier;

import com.poc.domain.Candidate;
import com.poc.exception.ResourceNotFoundException;
import com.poc.service.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CandidateSMImpl implements CandidateSM {

    private CandidateRepository candidateRepository;

    public CandidateSMImpl(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }


    @Override
    public Candidate add(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public List<Candidate> getAll() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate getById(String id) {
        return candidateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @Override
    public Candidate update(String id, Candidate candidate) {
        Optional<Candidate> cand = candidateRepository.findById(id);
        if (cand.isPresent()) {
            return candidateRepository.save(candidate);
        }
        throw new ResourceNotFoundException();
    }

    @Override
    public void delete(String id) {
        Candidate candidate = candidateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        candidateRepository.delete(candidate);
    }

    @Override
    public Candidate findByEmail(String email) {
        return candidateRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @Override
    public List<Candidate> searchByExp(Double expFrom, Double expTo) {
        List<Candidate> result;
        if (expTo != null) {
            result = candidateRepository.findByExpBetween(expFrom, expTo);
        } else {
            result = candidateRepository.findByExpGreaterThanEqual(expFrom);
        }
        return result;
    }
}
