package com.codebase.expensetrackerapi.repositories;

import com.codebase.expensetrackerapi.models.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String>  {
    Optional<Expense> findByName(String name);
}
