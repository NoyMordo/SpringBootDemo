package com.example.SpringBootDemo.Exception;

public class BadCityException extends Exception {
    public BadCityException(){
        super("city length should be between 3-20 characters, check your city and try again...");
    }
}
