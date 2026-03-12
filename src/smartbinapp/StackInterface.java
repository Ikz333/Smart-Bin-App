/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
// This interface defines the basic behaviours of a Stack
// Any Stack class that implements this interface must include these methods
public interface StackInterface {

    // Checks if the stack is empty
    public boolean isEmpty();

    // Checks if the stack is full
    // In this project it will always return false because the stack uses ArrayList
    public boolean isFull();

    // Adds a new item to the top of the stack
    public void push(Object newItem);

    // Removes and returns the top item from the stack
    public Object pop();
    
    // Returns the top item without removing it
    public Object peek();

}
