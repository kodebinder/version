package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.entities.Person;
import com.company.service.PeopleManagementService;

@SpringBootApplication
public class NamedNativeQueryApplication implements CommandLineRunner {

	private final PeopleManagementService peopleManagementService;

	public NamedNativeQueryApplication(PeopleManagementService peopleManagementService) {
		this.peopleManagementService = peopleManagementService;
	}

	public static void main(String[] args) {
		SpringApplication.run(NamedNativeQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// createPerson();
		createPersons();
		getPersonInfoByLastName();
		getPersonInfoByFirstNameAndEmail();
	}

	private void getPersonInfoByLastName() {
		List<Person> personInfoByLastName = peopleManagementService.getPersonInfoByLastName("Khan");
		personInfoByLastName.forEach(System.out::println);
	}

	private void getPersonInfoByFirstNameAndEmail() {
		List<Person> personInfoByLastName = peopleManagementService.getPersonInfoByFirstNameAndEmail("Barry",
				"barry.j2019@Gmail.com");
		personInfoByLastName.forEach(System.out::println);
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("Barry", "Johnson", "barry.j2019@Gmail.com", new Date()),
				new Person("Kishan", "Kumar", "kishan.cs2019@yahoo.com", new Date()),
				new Person("Shahrukh", "Khan", "shahrukh.khan@Gmail.com", new Date()),
				new Person("Salman", "Khan", "salman.khan@Gmail.com", new Date()),
				new Person("Aamir", "Khan", "aamir.khan@Gmail.com", new Date()));
		Iterable<Person> createPersons = peopleManagementService.createPersons(personList);
		for (Person person : createPersons) {
			System.out.println(person);
		}
	}

	private void createPerson() {
		Person person1 = new Person("Sean", "Muphy", "sean.m2017@gamil.com", new Date());
		Person personDb = peopleManagementService.createPerson(person1);
		System.out.println(personDb);
	}
}
