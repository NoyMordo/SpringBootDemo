package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.Exception.*;
import com.example.SpringBootDemo.Service.PersonService;
import com.example.SpringBootDemo.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/createPerson")
    public ResponseEntity<?> createPerson(@RequestBody Person person) throws PersonAlreadyExistsException, BadHeightException, BadAgeException, BadNameException, BadZipcodeException, BadStateException, BadWeightException, BadCityException, BadIdException, BadStreetException {
        personService.createPerson(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/getOnePerson/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) throws PersonNotFoundException {
    return ResponseEntity.ok(personService.findById(id));
    }

    @GetMapping("/getAllPersons")
    public ResponseEntity<List<Person>> getAllPersons() {
        return ResponseEntity.ok(personService.getAll());
    }

    @PutMapping("/updatePerson")
    public ResponseEntity<?> updatePerson(@RequestBody Person person) throws PersonNotFoundException {
        personService.updatePerson(person);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping("/deletePerson{id}")
    public ResponseEntity<?> deletePerson(@PathVariable String id) throws PersonNotFoundException {
        personService.deletePerson(id);
        return ResponseEntity.ok("Person id: " + id + "deleted");
    }


}
