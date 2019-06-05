package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String fname,@RequestParam String lname,@RequestParam int age)
	{
		Person p = personService.create(fname, lname, age);
		return p.toString();
	}
	
	@RequestMapping("/get")
	public Person getPerson(@RequestParam String fname)
	{
		return personService.getByFirstName(fname);
	}
	
	@RequestMapping("/getAll")
	public List<Person> getAll()
	{
		return personService.getAll();
	}
	
	@RequestMapping("/update")
	public Person update(@RequestParam String fname,@RequestParam String lname,@RequestParam int age)
	{
		Person p = personService.update(fname, lname, age);
		return p;
	}
	
	@RequestMapping("/delete")
	public void deleteByName(@RequestParam String fname)
	{
		personService.delete(fname);
	}
	
	@RequestMapping("/deleteAll")
	public void deleteAll()
	{
		personService.deleteAll();
	}
	
	
}
