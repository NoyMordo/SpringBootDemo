package com.example.SpringBootDemo.Exception;

public class BadZipcodeException extends Exception {
    public BadZipcodeException(){
        super("zipcode should be only numbers, check your zipcode and try again...");
    }
}
