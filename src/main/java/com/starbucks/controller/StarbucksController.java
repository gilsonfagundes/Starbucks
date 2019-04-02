package com.starbucks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starbucks.model.Coffee;
import com.starbucks.repository.CoffeeRepository;

@RestController
public class StarbucksController {

	@Autowired
	private CoffeeRepository coffeeRepository;
	
	@RequestMapping("/")
	public String sayHello(){
	  coffeeRepository.deleteAll();
	  coffeeRepository.save(new Coffee("Mocca", 1.55, true)); 
	  coffeeRepository.save(new Coffee("Frapuccino",1.67, true)); 
	  coffeeRepository.save(new Coffee("Capuccino", 1.24, true));
	  coffeeRepository.save(new Coffee("Americano", 1.66, false));
	
	  return coffeeRepository.findAll().toString();
	}
}
