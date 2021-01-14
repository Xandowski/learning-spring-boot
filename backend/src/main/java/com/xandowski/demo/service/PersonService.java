package com.xandowski.demo.service;

import com.xandowski.demo.dao.PersonDao;
import com.xandowski.demo.model.Person;

public class PersonService {
  private final PersonDao personDao;

  public PersonService(PersonDao personDao) {
    this.personDao = personDao;
  }

  public int addPerson(Person person) {
    return personDao.insertPerson(person);
  }
}
