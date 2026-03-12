/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartbinapp;

import java.util.*;

/**
 *
 * @author ikram
 */
public class Queue implements QueueInterface {

    // ArrayList used to store queue elements
    // The first item in the list will be the front of the queue
    private ArrayList<String> queue;

    // Constructor that creates the ArrayList when the Queue object is made
    public Queue() {
        queue = new ArrayList<String>();
    }

    // Checks if the queue is empty
    // Returns true if there are no items in the queue
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Adds a new element to the end of the queue
    public void enqueue(Object element) {
        queue.add((String) element);
    }

    // Removes and returns the first element from the queue
    // If the queue is empty, it returns null
    public Object dequeue() {
        if (queue.size() > 0) {
            return queue.remove(0);
        } else {
            return null;
        }
    }
    
    // Returns the first element in the queue without removing it
    public Object peek() {
        if (!queue.isEmpty()) {
            return queue.get(0);
        } else {
            return null;
        }
    }

    // Returns the number of elements currently in the queue
    public int size() {
        return queue.size();
    }

    // Converts the queue contents into a string format
    // Useful for displaying the queue
    @Override
    public String toString() {
        return queue.toString();
    }
}
