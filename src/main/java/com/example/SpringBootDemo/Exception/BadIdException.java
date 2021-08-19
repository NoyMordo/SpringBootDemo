package com.example.SpringBootDemo.Exception;

public class BadIdException extends Exception {
    public BadIdException(){
        super("Id length should be between 3-40 characters, check your id and try again...");
    }
}
