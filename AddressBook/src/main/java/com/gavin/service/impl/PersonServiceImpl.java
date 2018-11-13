package com.gavin.service.impl;

import com.gavin.dao.PersonDao;
import com.gavin.domain.Person;
import com.gavin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void addPerson(Person person) {
        personDao.insertPerson(person);
    }

    @Override
    public void deletePerson(int id) {
        personDao.deletePerson(id);
    }

    @Override
    public void editPersonById(Person person) {
        personDao.updatePerson(person);
    }

    @Override
    public Person findPersonById(int id) {
        return personDao.findPersonById(id);
    }

    @Override
    public List<Person> findAllPerson() {
        return personDao.findAllPerson();
    }
}
