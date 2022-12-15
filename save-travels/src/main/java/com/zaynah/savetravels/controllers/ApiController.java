package com.zaynah.savetravels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaynah.savetravels.models.Expense;
import com.zaynah.savetravels.services.ExpenseService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	public final ExpenseService expenseServ;
	
	
	public ApiController(ExpenseService expenseServ) {
		this.expenseServ = expenseServ;
		// TODO Auto-generated constructor stub
	}
//------- FIND ALL ---------
	@GetMapping("/expenses")
	public List<Expense> findAllExpenses(){
		return expenseServ.getAll();
	}

	
//----------- CREATE ONE /expenses ---------
	@PostMapping("/expenses")
	public Expense createExpense(@RequestParam("expenseName") String expenseName, @RequestParam("vendor") String vendor, @RequestParam("amount") Integer amount) {
		Expense newExpense = new Expense(vendor, expenseName, amount);
		return expenseServ.create(newExpense);
	}

	
// ---------- FIND ONE /expense/{id}------------
	@GetMapping("/expense/{id}")
	public Expense findOneExpense(@PathVariable("id") Long id) {
		return expenseServ.findOne(id);
	}
	
	

// ----- EDIT /expense/{id} ------------	
	@PutMapping("/expense/{id}")
	public Expense findOneAndUpdate(@PathVariable("id)") Long id, @RequestParam("expenseName") String expenseName, @RequestParam("vendor") String vendor, @RequestParam("amount") Integer amount) {
		return expenseServ.update(id, vendor, expenseName, amount);
	}
	
	
//------- DELETE ----------- 
	
	@DeleteMapping("expense/{id}")
	public String delete (@PathVariable("id") Long id) {
		return expenseServ.deleteById(id);
	}
}
