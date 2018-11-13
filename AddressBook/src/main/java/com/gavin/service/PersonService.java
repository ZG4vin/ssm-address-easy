package com.gavin.service;

import com.gavin.domain.Person;

import java.util.List;

public interface PersonService {
    void addPerson(Person person);
    void deletePerson(int id);
    void editPersonById(Person person);;
    Person findPersonById(int id);
    List<Person> findAllPerson();
}
