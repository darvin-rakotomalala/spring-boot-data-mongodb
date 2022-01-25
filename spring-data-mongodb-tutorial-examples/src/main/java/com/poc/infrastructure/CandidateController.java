package com.poc.infrastructure;

import com.poc.domain.Candidate;
import com.poc.service.metier.CandidateSM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    private CandidateSM candidateSM;

    @PostMapping
    public Candidate add(@RequestBody Candidate candidate) {
        return candidateSM.add(candidate);
    }

    @GetMapping
    public List<Candidate> getAll() {
        return candidateSM.getAll();
    }

    @GetMapping("/{id}")
    public Candidate getById(@PathVariable String id) {
        return candidateSM.getById(id);
    }

    @PutMapping("/{id}")
    public Candidate update(@PathVariable String id, @RequestBody Candidate candidate) {
        return candidateSM.update(id, candidate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        candidateSM.delete(id);
    }

    @GetMapping("/searchByEmail")
    public Candidate findByEmail(@RequestParam(name = "email") String email) {
        return candidateSM.findByEmail(email);
    }

    @GetMapping("/searchByExp")
    public List<Candidate> searchByExp(@RequestParam(name = "expFrom") Double expFrom, @RequestParam(name = "expTo") Double expTo) {
        return candidateSM.searchByExp(expFrom, expTo);
    }
}
