package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/people")
    public ResponseEntity<Person> createPerson(@RequestBody Person p)   {
        return new ResponseEntity<Person>(personService.createPerson(p), HttpStatus.CREATED);
    }
    @GetMapping("/people/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable int id)    {
        return new ResponseEntity<Person>(personService.findOne(id),HttpStatus.OK);
    }
    @GetMapping("/people")
    public ResponseEntity<Iterable<Person>> getPersonList(){
        return new ResponseEntity<Person>(personService.findAll(), HttpStatus.OK);
    }
    @PutMapping("/people/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Person p, Integer id)   {
        return new ResponseEntity<Person>(personService.savePerson(p, id), HttpStatus.OK);
    }
    @DeleteMapping("/people/{id}")
    void deletePerson(int id)   {
        personService.deletePersonById(id);
    }


}
