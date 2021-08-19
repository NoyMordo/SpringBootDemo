package com.example.SpringBootDemo.Exception;

public class BadStreetException extends Exception {
    public BadStreetException(){
        super("street length should be between 3-50 characters, check your street and try again...");
    }

}
