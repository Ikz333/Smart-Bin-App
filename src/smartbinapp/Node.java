/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
public class Node {

    // Stores the data inside the node
    private Object element;

    // Reference to the next node in the linked list
    private Node next;

    // Constructor used to create a new node
    // It stores the element and the reference to the next node
    public Node(Object inElement, Node inNode) {
        element = inElement;
        next = inNode;
    }

    // Returns the next node in the list
    public Node getNext() {
        return next;
    }

    // Sets or updates the reference to the next node
    public void setNext(Node inNode) {
        next = inNode;
    }

    // Returns the element stored in this node
    public Object getElement() {
        return element;
    }

    // Updates the element stored in the node
    public void setElement(Object inElement) {
        element = inElement;
    }

    // Converts the element into a string
    // This is useful when displaying the node contents
    public String toString() {
        return element.toString();
    }
}
