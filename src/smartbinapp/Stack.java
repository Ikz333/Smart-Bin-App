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

    private ArrayList<String> Stack;

    /**
     * Creates a new instance of Stack
     */
    public Stack() {
        Stack = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return Stack.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the TOP (first position) of the stack and returns
     * it
     */
    public Object pop() {
        if (!(Stack.isEmpty())) {
            return Stack.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts/inserts an item onto the TOP (first position) of the stack
     */
    public void push(Object newItem) {
        Stack.add(0, (String) newItem);
    }
    
    public Object peek() {
        if (!Stack.isEmpty()) {
            return Stack.get(0);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return Stack.toString();
    }

}
