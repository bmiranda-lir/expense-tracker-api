package com.codebase.expensetrackerapi.service;

import com.codebase.expensetrackerapi.entity.Expense;
import com.codebase.expensetrackerapi.mapper.ExpenseMapper;
import com.codebase.expensetrackerapi.models.ExpenseRequest;
import com.codebase.expensetrackerapi.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private ExpenseRepository expenseRepository;

    public List<Expense> getAll() {
        return expenseRepository.findAll();
    }

    public void addExpense(final ExpenseRequest expenseRequest) {
        expenseRepository.insert(ExpenseMapper.toEntity(expenseRequest));
    }


    @Autowired
    public void setExpenseRepository(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
}
