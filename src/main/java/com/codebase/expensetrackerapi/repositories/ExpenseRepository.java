package com.codebase.expensetrackerapi.repositories;

import com.codebase.expensetrackerapi.models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExpenseRepository {

    public List<Expense> getAll(){
        return List.of(
                new Expense()
                        .setName("a"),
                new Expense().setName("b")
        );
    }
}
