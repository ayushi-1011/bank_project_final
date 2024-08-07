package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Person;

public interface PersonDao extends JpaRepository<Person, Long> {
}
