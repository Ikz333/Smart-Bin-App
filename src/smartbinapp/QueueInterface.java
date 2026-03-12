/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
// This interface defines the basic behaviours of a Queue
// Any Queue class that implements this interface must provide these methods
public interface QueueInterface {

    // Checks if the queue is empty
    public boolean isEmpty();

    // Adds an element to the end of the queue
    public void enqueue(Object element);

    // Removes and returns the first element from the queue
    public Object dequeue();
    
    // Returns the first element without removing it
    public Object peek();
    
    // Returns size of the queue
    public int size();
}
