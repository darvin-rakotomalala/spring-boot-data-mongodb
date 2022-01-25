package com.poc.service.metier;

import com.poc.domain.Expense;

import java.util.List;

public interface ExpenseSM {
    Expense add(Expense expense);

    Expense update(Expense expense);

    void delete(String id);

    List<Expense> getAll();

    Expense getByName(String name);
}
