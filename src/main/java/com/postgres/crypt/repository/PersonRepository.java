package com.postgres.crypt.repository;

import com.postgres.crypt.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
