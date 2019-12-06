package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;
    Integer id;

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findOne(Integer id)  {
        return personRepository.findOne(id);
    }

    public Person savePerson(Person person)   {
        return personRepository.save(person);

    }

    public void deletePerson(Person person) {
        personRepository.delete(person);
    }

    public void deletePersonById(Integer id) {
        personRepository.delete(id);
    }

    public Person createPerson(Person person)   {
        return personRepository.save(person);

    }




}
