package com.spiritwisestudios.person;
// Person.java
// This class represents a person with a first name, last name, and age
public class Person {
    private String firstName; // First name
    private String lastName; // Last name
    private int age; // Age

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName; // Set the first name
        this.lastName = lastName; // Set the last name
        this.age = age; // Set the age
    }
    
    // Getters
    public String getFirstName() {
        return firstName; // Return the first name
    }
    
    public String getLastName() {
        return lastName; // Return the last name
    }
    
    public int getAge() {
        return age; // Return the age
    }
    
    // toString method for easy printing
    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age; // Return the person's details
    }
}
