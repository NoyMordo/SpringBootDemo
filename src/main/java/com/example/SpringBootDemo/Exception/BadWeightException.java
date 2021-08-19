package com.example.SpringBootDemo.Exception;

public class BadWeightException extends Exception {
    public BadWeightException(){
        super("weight should be higher than 0, check your weight and try again...");
    }
}
