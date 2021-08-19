package com.example.SpringBootDemo.Exception;

public class PersonAlreadyExistsException extends  Exception{

    public PersonAlreadyExistsException(){
        super("Person Already Exists with this id");
    }
}
