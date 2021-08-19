package com.example.SpringBootDemo.Exception;

public class BadHeightException extends Exception {
    public BadHeightException(){
        super("height should be higher than 0, check your height and try again...");
    }
}
