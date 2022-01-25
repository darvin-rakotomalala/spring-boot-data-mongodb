package com.poc.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "candidate")
public class Candidate {
    @Id
    private String id;
    private String name;
    private double exp;
    @Indexed(unique = true)
    private String email;

    public Candidate() {
    }

    public Candidate(String id, String name, double exp, String email) {
        this.id = id;
        this.name = name;
        this.exp = exp;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
