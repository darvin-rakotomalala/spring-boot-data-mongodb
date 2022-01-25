package com.poc.service.metier;

import com.poc.domain.Expense;
import com.poc.exception.ResourceNotFoundException;
import com.poc.service.repository.ExpenseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExpenseSMImpl implements ExpenseSM {

    private ExpenseRepository expenseRepository;

    public ExpenseSMImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense add(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense update(Expense expense) {
        Expense exp = expenseRepository.findById(expense.getId())
                .orElseThrow(() -> new ResourceNotFoundException());
        return expenseRepository.save(expense);
    }

    @Override
    public void delete(String id) {
        Expense exp = expenseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        expenseRepository.deleteById(id);
    }

    @Override
    public List<Expense> getAll() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense getByName(String name) {
        return expenseRepository.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException());
    }
}
