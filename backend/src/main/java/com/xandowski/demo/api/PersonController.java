package com.xandowski.demo.api;

import com.xandowski.demo.model.Person;
import com.xandowski.demo.service.PersonService;

public class PersonController {
  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  public void addPerson(Person person) {
    personService.addPerson(person);
  }
}
