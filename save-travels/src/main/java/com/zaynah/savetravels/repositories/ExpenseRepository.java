package com.zaynah.savetravels.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zaynah.savetravels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository <Expense, Long>{

	List<Expense> findAll();

//	List<Expense> findByDescriptionContaining(String search);
//
//	Long countByTitleContaining(String search);
//
//	Long deleteByTitleStartingWith(String search);


}
