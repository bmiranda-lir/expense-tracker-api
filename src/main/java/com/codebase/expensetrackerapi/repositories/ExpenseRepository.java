package com.codebase.expensetrackerapi.repositories;

import com.codebase.expensetrackerapi.models.Expense;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ExpenseRepository {

    private static ArrayList<Expense> expenseMemory = new ArrayList<>(List.of(
            new Expense()
                    .setName("a"),
            new Expense().setName("b")
    ));


    public List<Expense> getAll() {
        return expenseMemory;
    }

    public boolean findExpense(final Expense expense) {
        return expenseMemory
                .stream()
                .anyMatch(expense1 -> expense1.getName().equals(expense.getName()));
    }

    public void addExpense(final Expense expense) {
        expenseMemory.add(expense);
    }
}
