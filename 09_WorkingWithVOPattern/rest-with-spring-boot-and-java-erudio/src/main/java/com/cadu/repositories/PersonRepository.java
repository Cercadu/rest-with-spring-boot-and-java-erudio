package com.cadu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.data.vo.v1.PersonVO;
import com.cadu.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

	Object save(PersonVO entity); }
