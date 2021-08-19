package com.example.SpringBootDemo.Exception;

public class BadAgeException extends Exception {
    public BadAgeException(){
        super("age should be between 0-200, check your age and try again..");
    }
}
