package com.starbucks.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Coffees")
public class Coffee {


	@Id
	private ObjectId _id;
	private String name;
	private double price;
	private boolean available;
	
	public Coffee() {}

	public Coffee(String name, double price, boolean available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	
	@Override
	public String toString() {
		return "Coffee [id=" + _id + ", name=" + name + ", price=" + price + ", available=" + available + "]";
	}
		
	public String getId() {
		return _id.toHexString();
	}
	public void setId(ObjectId id) {
		this._id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
