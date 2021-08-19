package com.example.SpringBootDemo.Repository;

import com.example.SpringBootDemo.beans.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {



}
