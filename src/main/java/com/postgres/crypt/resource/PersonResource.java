package com.postgres.crypt.resource;

import com.postgres.crypt.model.Person;
import com.postgres.crypt.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController("/")
public class PersonResource {

    private final PersonRepository repository;

    public PersonResource(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String findAll() {
        repository.save(Person.builder().name("Doughert").password("senhaforte").build());
        return repository.findAll().toString();
    }
}
