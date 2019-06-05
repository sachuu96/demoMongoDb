package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	//create operation
	public Person create(String fname,String lname,int age) {
		return personRepository.save(new Person(fname,lname,age));
	}
	
	//retriew Operation
	public List<Person> getAll()
	{
		return personRepository.findAll();
	}
	
	public Person getByFirstName(String fname)
	{
		return personRepository.findByFirstName(fname);
	}
	
	//update operation
	public Person update(String fname,String lname,int age)
	{
		Person p = personRepository.findByFirstName(fname);
		p.setFirstName(fname);
		p.setLastName(lname);
		p.setAge(age);
		return personRepository.save(p);
		//personRepository.delete(p);
	}
	
	//delete
	public void deleteAll()
	{
		personRepository.deleteAll();
	}
	
	public void delete(String fname)
	{
		Person p  = personRepository.findByFirstName(fname);
		personRepository.delete(p);
	}
}
