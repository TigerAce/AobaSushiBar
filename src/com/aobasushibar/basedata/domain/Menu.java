package com.aobasushibar.basedata.domain;

public class Menu {
	
	private int ID;
	private String name;
	private String description;
	private float price;
	
	
	
	public void setID(int ID){
		this.ID = ID;
	}
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
