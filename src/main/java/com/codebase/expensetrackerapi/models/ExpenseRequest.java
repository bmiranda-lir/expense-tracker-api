package com.codebase.expensetrackerapi.models;

public class ExpenseRequest {
    private String description;
    private int value;



    public String getDescription() {
        return description;
    }

    public ExpenseRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getValue() {
        return value;
    }

    public ExpenseRequest setValue(int value) {
        this.value = value;
        return this;
    }
}
