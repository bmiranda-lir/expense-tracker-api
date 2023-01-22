package com.codebase.expensetrackerapi.service;

import com.codebase.expensetrackerapi.models.Expense;
import com.codebase.expensetrackerapi.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExpenseService {

    private ExpenseRepository expenseRepository;

    public List<Expense> getAll() {
        //ALL MY business LOGIC GOES IN THIS CLASS
        return expenseRepository.getAll();
    }

    public boolean addExpense(final Expense expense) {

        if (expenseRepository.findExpense(expense)) {
            return false;
        }
        expenseRepository.addExpense(expense);
        return true;
    }


    @Autowired
    public void setExpenseRepository(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
}
