package com.poc.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Document("expense")
public class Expense {
    @Id
    private String id;
    @Field("name")
    @Indexed(unique = true)
    private String expenseName;
    @Field("category")
    private ExpenseCategory expenseCategiry;
    @Field("amount")
    private BigDecimal expenseAmount;

    public Expense() {
    }

    public Expense(String id, String expenseName, ExpenseCategory expenseCategiry, BigDecimal expenseAmount) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseCategiry = expenseCategiry;
        this.expenseAmount = expenseAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public ExpenseCategory getExpenseCategiry() {
        return expenseCategiry;
    }

    public void setExpenseCategiry(ExpenseCategory expenseCategiry) {
        this.expenseCategiry = expenseCategiry;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
}
