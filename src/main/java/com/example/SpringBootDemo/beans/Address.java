package com.example.SpringBootDemo.beans;

public class Address {

    private State state;
    private String city;
    private String street;
    private String zipcode;
    private boolean containsAnimals;

    public Address(State state, String city, String street, String zipcode, boolean containsAnimals) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
        this.containsAnimals = containsAnimals;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isContainsAnimals() {
        return containsAnimals;
    }

    public void setContainsAnimals(boolean containsAnimals) {
        this.containsAnimals = containsAnimals;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state=" + state +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", containsAnimals=" + containsAnimals +
                '}';
    }
}
