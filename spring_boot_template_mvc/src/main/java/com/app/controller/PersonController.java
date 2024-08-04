package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.entities.Person;
import com.app.services.PersonService;

import java.util.Optional;

import javax.management.AttributeNotFoundException;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable(value = "id") Long personId) {
        Optional<Person> person = personService.getPersonById(personId);
        return person.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePersonDetails(@PathVariable(value = "id") Long personId,
                                                      @RequestBody Person personDetails) {
        Person updatedPerson = personService.updatePersonDetails(personId, personDetails);
		return ResponseEntity.ok(updatedPerson);
    }
}
