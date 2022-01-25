package com.poc;

import com.poc.domain.Expense;
import com.poc.domain.ExpenseCategory;
import com.poc.service.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataMongodbCrudExampleApplication implements CommandLineRunner {

    @Autowired
    ExpenseRepository expenseRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMongodbCrudExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        expenseRepository.deleteAll();
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(new Expense(null, "Movie Tickets", ExpenseCategory.ENTERTAINMENT, BigDecimal.valueOf(40)));
        expenseList.add(new Expense(null, "Dinner", ExpenseCategory.RESTAURANT, BigDecimal.valueOf(60)));
        expenseList.add(new Expense(null, "Netflix", ExpenseCategory.ENTERTAINMENT, BigDecimal.valueOf(10)));
        expenseList.add(new Expense(null, "Gym", ExpenseCategory.MISC, BigDecimal.valueOf(20)));
        expenseList.add(new Expense(null, "Internet", ExpenseCategory.UTILITIES, BigDecimal.valueOf(30)));

        expenseRepository.insert(expenseList);
    }
}
