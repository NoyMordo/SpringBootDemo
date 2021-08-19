package com.example.SpringBootDemo.Exception;

public class BadStateException extends Exception {
    public BadStateException(){
        super("state should be only israel, check your state and try again...");
    }
}
