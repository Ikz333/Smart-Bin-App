/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
// This interface defines the main behaviours of a singly linked list
// Any class that implements this interface must include these methods
public interface SLListInterface {

    // Adds an element at a specific position in the list
    public void add(int iPosition, Object theElement);

    // Adds an element to the end of the list
    public void add(Object theElement);

    // Returns the element stored at a given position
    public Object get(int iPosition);

    // Removes the element at a specific position
    public void remove(int iPosition);

    // Checks if the linked list is empty
    public boolean isEmpty();

    // Returns the number of elements currently in the list
    public int size();

    // Prints all elements in the list (mainly used for testing)
    public void printList();
}