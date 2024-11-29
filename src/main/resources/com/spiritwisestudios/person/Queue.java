package com.spiritwisestudios.person;


import java.util.ArrayList; // For the ArrayList class
import java.util.Comparator; // For sorting

public class Queue {
    private ArrayList<Person> queue; // ArrayList to store the queue

    public Queue() {
        queue = new ArrayList<>(); // Initialize the ArrayList
    }

    // Enqueue method
    public void enqueue(Person p) { // Add a person to the queue
        queue.add(p); 
    }

    // Dequeue method
    public Person dequeue() { // Remove a person from the queue
        if(queue.isEmpty()){ // Check if the queue is empty
            return null; // Return null if the queue is empty
        }
        return queue.remove(0); // Remove and return the first person in the queue
    }

    // Method to display the queue
    public void displayQueue(){ 
        for(Person p : queue) { // Loop through the queue
            System.out.println(p); // Print the person
        }
    }

    // QuickSort method
    public void quickSort(Comparator<Person> comparator) { 
        quickSortHelper(0, queue.size() - 1, comparator); // Call the helper method
    }

    private void quickSortHelper(int low, int high, Comparator<Person> comparator){ 
        if(low < high){ // Check if the low index is less than the high index
            int pi = partition(low, high, comparator); // Get the partition index
            quickSortHelper(low, pi - 1, comparator); // Recursively sort the left side
            quickSortHelper(pi + 1, high, comparator); // Recursively sort the right side
        }
    }

    private int partition(int low, int high, Comparator<Person> comparator) {
        Person pivot = queue.get(high); // Set the pivot to the last element
        int i = low - 1; // Set the index of the smaller element
        for(int j = low; j < high; j++) { // Loop through the elements
            if(comparator.compare(queue.get(j), pivot) <= 0) {  // Compare the elements
                i++; // Increment the index of the smaller element
                // Swap queue[i] and queue[j]
                Person temp = queue.get(i); 
                queue.set(i, queue.get(j)); 
                queue.set(j, temp); 
            }
        }
        // Swap queue[i+1] and queue[high]
        Person temp = queue.get(i + 1); 
        queue.set(i + 1, queue.get(high)); // Set the pivot element in the correct position
        queue.set(high, temp); 
        return i + 1; // Return the partition index
    }
}
