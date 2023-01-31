package com.codebase.expensetrackerapi.mapper;

import com.codebase.expensetrackerapi.entity.Expense;
import com.codebase.expensetrackerapi.models.ExpenseRequest;

import java.util.Date;

public class ExpenseMapper {
    public static Expense toEntity(final ExpenseRequest expenseRequest){
        return new Expense()
                .setDescription(expenseRequest.getDescription())
                .setValue(expenseRequest.getValue())
                .setCreatedDate(new Date());
    }
}
