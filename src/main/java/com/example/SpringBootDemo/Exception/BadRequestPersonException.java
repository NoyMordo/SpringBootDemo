package com.example.SpringBootDemo.Exception;

public class BadRequestPersonException extends  Exception{

    public BadRequestPersonException(){
        super("Check your person!" +
                "Id length should be between 3-40 characters," +
                "name length should be between 3-20 characters," +
                "age should be between 0-200," +
                "height should be higher than 0," +
                "weight should be higher than 0," +
                "state should be only israel," +
                "city length should be between 3-20 characters," +
                "street length should be between 3-50 characters," +
                "zipcode should be only numbers." +
                "check your new person and try again :)");
    }

}
