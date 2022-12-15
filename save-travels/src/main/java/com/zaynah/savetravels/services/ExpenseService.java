package com.zaynah.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zaynah.savetravels.models.Expense;
import com.zaynah.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
		
	
	
	private final ExpenseRepository expenseRepo;
	
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Expense create(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	public List<Expense> getAll(){
		return expenseRepo.findAll();
	}
	
	public Expense findOne(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
				if(optionalExpense.isPresent()) {
					return optionalExpense.get();
				} else {
					return null;
				}
	}

	public Expense update(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	public String deleteById(Long id) {
		expenseRepo.deleteById(id);
		return "You deleted the record with the id of: " +id;
	}


	public Expense update(Long id, String vendor, String expenseName, Integer amount) {
		// TODO Auto-generated method stub
		return null;
	}
}
