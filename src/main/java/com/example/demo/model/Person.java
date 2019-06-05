package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	@Id
	String id;
	String firstName;
	String LastName;
	int age;
	
	public void Person(String fname,String lname,int age)
	{
		this.firstName=fname;
		this.LastName=lname;
		this.age=age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return "Person First Name: "+this.firstName+" "+this.LastName+" age: "+this.age;
	}
}
