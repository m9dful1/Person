package com.spiritwisestudios.person;
// Main.java

import java.util.Comparator; // For user input
import java.util.Scanner; // For sorting

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input
        Queue queue = new Queue(); // Create a new queue

        // Prompt the user to add five people to the queue
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("First Name: ");
            String firstName = scanner.nextLine(); // Get the first name
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine(); // Get the last name
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine()); // Get the age
            Person person = new Person(firstName, lastName, age); // Create a new person
            queue.enqueue(person); // Add the person to the queue
            System.out.println(); // Add a new line
        }

        // Display the contents of the queue
        System.out.println("Contents of the queue:");
        queue.displayQueue(); // Display the queue

        // Sort the queue descending by last name
        queue.quickSort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) { // Compare two people
                return p2.getLastName().compareTo(p1.getLastName()); // Compare last names
            }
        });

        // Display the queue after sorting by last name
        System.out.println("\nQueue sorted descending by last name:");
        queue.displayQueue(); // Display the queue

        // Sort the queue descending by age
        queue.quickSort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) { // Compare two people
                return Integer.compare(p2.getAge(), p1.getAge()); // Compare ages
            }
        });

        // Display the queue after sorting by age
        System.out.println("\nQueue sorted descending by age:");
        queue.displayQueue(); // Display the queue

        scanner.close(); // Close the scanner
    }
}
