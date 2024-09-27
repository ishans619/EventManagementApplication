package com.Project2.EventManagementApp.controller;

import com.Project2.EventManagementApp.model.Person;
import com.Project2.EventManagementApp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @GetMapping("/all")
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
    }
}
