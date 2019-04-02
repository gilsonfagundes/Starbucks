package com.starbucks.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.starbucks.model.Coffee;
import com.starbucks.repository.CoffeeRepository;

@RestController
@RequestMapping("/api/v1/coffees")
public class CoffeeController {

	@Autowired
	private CoffeeRepository coffeeRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Coffee> list() {
		return coffeeRepository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Coffee findById(@PathVariable("id") ObjectId id) {
		return coffeeRepository.findBy_id(id);
	}
	
	@RequestMapping(value = "/names/{name}", method = RequestMethod.GET)
	public List<Coffee> findByName(@PathVariable("name") String name) {
		return coffeeRepository.findByname(name);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Coffee save(@Valid @RequestBody Coffee coffee) {
		coffee.setId(ObjectId.get());
		coffeeRepository.save(coffee);
		return coffee;
	}
	
}
