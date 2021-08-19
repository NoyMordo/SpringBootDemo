package com.example.SpringBootDemo.Service;
import com.example.SpringBootDemo.Exception.*;
import com.example.SpringBootDemo.Repository.PersonRepository;
import com.example.SpringBootDemo.beans.Person;
import com.example.SpringBootDemo.beans.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void createPerson(Person person) throws PersonAlreadyExistsException, BadIdException, BadNameException, BadAgeException, BadHeightException, BadWeightException, BadStateException, BadCityException, BadStreetException, BadZipcodeException {
        if(personRepository.existsById(person.getId())){
            throw new PersonAlreadyExistsException();
        }
        if(!(person.getId().length() > 3 && person.getId().length() < 40)){
            throw new BadIdException();
        }
       if(!(person.getName().length() > 3 && person.getName().length() < 20)) {
           throw new BadNameException();
       }
        if(!(person.getAge() > 0 && person.getAge() <= 200)){
            throw new BadAgeException();
        }
        if(!(person.getHeight() > 0)){
            throw new BadHeightException();
        }
        if(!(person.getWeight() > 0 )){
            throw new BadWeightException();
        }
        if(person.getAddress().getState() != State.Israel) {
            throw new BadStateException();
        }
        if(!(person.getAddress().getCity().length() >= 3 && person.getAddress().getCity().length() <= 20)){
            throw new BadCityException();
        }
        if(!(person.getAddress().getStreet().length() >= 3 && person.getAddress().getStreet().length() <=50)){
            throw new BadStreetException();
        }
       if(!(person.getAddress().getZipcode().matches("[0-9]+"))){
           throw new BadZipcodeException();
        }
        personRepository.save(person);
    }

    public Person findById(String id) throws PersonNotFoundException {
        return personRepository.findById(id).orElseThrow(PersonNotFoundException::new);
    }
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    public void updatePerson(Person person) throws PersonNotFoundException {
        Person p = personRepository.findById(person.getId()).orElseThrow(PersonNotFoundException::new);
        if (p != null){
            personRepository.save(person);
        }
    }

    public void deletePerson(String id) throws PersonNotFoundException {
        Person p = personRepository.findById(id).orElseThrow(PersonNotFoundException::new);
        personRepository.deleteById(id);
    }

}
