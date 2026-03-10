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

    private ArrayList<String> Queue;

    /* Creates a new instance of Queue class */
    public Queue() {
        Queue = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return Queue.isEmpty();
    }

    public void enqueue(Object element) {
        Queue.add((String) element);
    }

    public Object dequeue() {
        if (Queue.size() > 0) {
            return Queue.remove(0);
        } else {
            return null;
        }
    }
    
    public Object peek() {
        if (!Queue.isEmpty()) {
            return Queue.get(0);
        } else {
            return null;
        }
    }

    public int size() {
        return Queue.size();
    }

    @Override
    public String toString() {
        return Queue.toString();
    }
}
