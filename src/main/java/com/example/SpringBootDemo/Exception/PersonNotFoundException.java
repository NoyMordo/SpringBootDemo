package com.example.SpringBootDemo.Exception;

public class PersonNotFoundException extends Exception{

    public PersonNotFoundException(){
        super("Person not found!");
    }
}
