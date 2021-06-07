package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.Loan;

@RestController
public class LoanController {
	@GetMapping(value = "/loans/{number}")
	public Loan getCountryByCode(@PathVariable("number") String number){
		
		return new Loan(number,"car", 400000,3258,18);
	}
}
