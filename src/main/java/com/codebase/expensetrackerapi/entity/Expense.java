package com.codebase.expensetrackerapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "expenses")
public class Expense {

    @Id
    private String id;
    private String description;
    private int value;

    private Date createdDate;

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Expense setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getValue() {
        return value;
    }

    public Expense setValue(int value) {
        this.value = value;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Expense setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }
}
