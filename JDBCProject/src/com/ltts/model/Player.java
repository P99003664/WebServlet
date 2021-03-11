package com.ltts.model;

public class Player {

	private String Name;
	private int Age;
	private String Country;
	
	public Player() {
		super();
	}

	public Player(String name, int age, String country) {
		super();
		Name = name;
		Age = age;
		Country = country;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Player [Name=" + Name + ", Age=" + Age + ", Country=" + Country + "]";
	}

}

