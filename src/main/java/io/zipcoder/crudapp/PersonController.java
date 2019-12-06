package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @PostMapping
    Person createPerson(Person p)   {
        return null;
    }
    @GetMapping("/people/{id}")
    Person getPerson(int id)    {
        return null;
    }
    @GetMapping("/people")
    List<Person> getPersonList(){
        return null;
    }
    @PutMapping("/people/{id}")
    Person updatePerson(Person p)   {
        return null;
    }
    @DeleteMapping("/people/{id}")
    void deletePerson(int id)   {}


}
