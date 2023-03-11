package com.cadu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{ }
