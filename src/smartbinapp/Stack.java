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
public class Stack implements StackInterface {

    // ArrayList used to store stack elements
    // The first position (index 0) represents the top of the stack
    private ArrayList<String> stack;

    // Constructor that creates the ArrayList when the Stack object is made
    public Stack() {
        stack = new ArrayList<String>();
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Checks if the stack is full
    // In this program it always returns false because ArrayList can grow dynamically
    public boolean isFull() {
        return false;
    }

    // Removes and returns the top element from the stack
    // If the stack is empty, it returns null
    public Object pop() {
        if (!(stack.isEmpty())) {
            return stack.remove(0);
        } else {
            return null;
        }
    }

    // Adds a new item to the top of the stack
    public void push(Object newItem) {
        stack.add(0, (String) newItem);
    }
    
    // Returns the top element of the stack without removing it
    public Object peek() {
        if (!stack.isEmpty()) {
            return stack.get(0);
        } else {
            return null;
        }
    }

    // Converts the stack contents into a string format
    // Useful for displaying the stack
    @Override
    public String toString() {
        return stack.toString();
    }

}
