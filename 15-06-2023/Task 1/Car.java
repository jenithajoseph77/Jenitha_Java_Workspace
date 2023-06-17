package com.dal.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {

	@Value(value="Hundai")
	private String name;
	@Value(value="Creta")
	private String model;
	@Value(value="2621")
	private Integer number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", number=" + number + "]";
	}
	
	public Car() {
		super();
	}
		public Car(String name, String model,Integer number) {
	super();
		this.name = name;
		this.model = model;
		this.number=number;
		}

		 
}
