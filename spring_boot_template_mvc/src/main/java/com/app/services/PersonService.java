package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PersonDao;
import com.app.entities.Person;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public Optional<Person> getPersonById(Long personId) {
        return personDao.findById(personId);
    }

    public Person updatePersonDetails(Long personId, Person personDetails) {
        Person person = personDao.findById(personId)
                .orElseThrow();

        person.setFirstName(personDetails.getFirstName());
        person.setLastName(personDetails.getLastName());
        person.setEmail(personDetails.getEmail());
        person.setPhoneNumber(personDetails.getPhoneNumber());
        person.setDateOfBirth(personDetails.getDateOfBirth());
        person.setGender(personDetails.getGender());
        person.setAddress(personDetails.getAddress());

       
        return personDao.save(person);
    }
}
