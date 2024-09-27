package com.Project2.EventManagementApp.repository;

import com.Project2.EventManagementApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
