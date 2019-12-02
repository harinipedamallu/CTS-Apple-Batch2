package com.cts.training.reactiveapp.documents;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {

	@org.springframework.data.annotation.Id
	private String id;  // auto generated
	
	private String description;
	private Double price;
	
	public Item() {}
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + ", price=" + price + "]";
	}


	public Item(String id, String description, Double price) {
		
		this.id = id;
		this.description = description;
		this.price = price;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
	
}
