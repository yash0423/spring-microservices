package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.Account;


@RestController
public class AccountController {
	@GetMapping(value = "/accounts/{number}")
	public Account getCountryByCode(@PathVariable("number") String number){
		
		return new Account(number,"savings", 10000);
	}
}
