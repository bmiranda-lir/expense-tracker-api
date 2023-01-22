package com.codebase.expensetrackerapi.models;

public class Expense {

    private String name;
    private int value;



    public String getName() {
        return name;
    }

    public Expense setName(String name) {
        this.name = name;
        return this;
    }

    public int getValue() {
        return value;
    }

    public Expense setValue(int value) {
        this.value = value;
        return this;
    }
}
