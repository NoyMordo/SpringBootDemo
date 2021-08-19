package com.example.SpringBootDemo.Exception;

public class BadNameException extends Exception {
    public BadNameException(){
        super("name length should be between 3-20 characters, check your name and try again...");
    }
}
