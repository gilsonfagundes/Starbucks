package com.starbucks.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.starbucks.model.Coffee;

public interface CoffeeRepository extends MongoRepository<Coffee, String> {

	Coffee findBy_id(ObjectId _id);
	
	List<Coffee> findByname(String name);
}
