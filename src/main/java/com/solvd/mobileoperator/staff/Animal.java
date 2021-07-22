package com.solvd.mobileoperator.staff;

import org.apache.log4j.Logger;

public class Animal {
	
	private final static Logger LOGGER = Logger.getLogger(Animal.class);
	
	private String name;
	private int id;
	private AnimalPlace animalPlace;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public AnimalPlace getPlace() {
		return animalPlace;
	}

	public void setPlace(AnimalPlace animalPlace) {
		this.animalPlace = animalPlace;
	}
	
}

