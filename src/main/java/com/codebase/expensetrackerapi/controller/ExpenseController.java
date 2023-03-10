package com.codebase.expensetrackerapi.controller;

import com.codebase.expensetrackerapi.models.Expense;
import com.codebase.expensetrackerapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "expense")
public class ExpenseController {

    private ExpenseService expenseService;

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAll();
    }

    @PostMapping()
    public boolean addExpense(@RequestBody Expense expense){
        return expenseService.addExpense(expense);
    }

    @Autowired
    public void setExpenseService(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }
}
