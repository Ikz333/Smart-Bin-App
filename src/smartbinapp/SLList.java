/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
public class SLList implements SLListInterface {

    // Reference to the first node in the linked list
    private Node head;

    // Keeps track of how many elements are in the list
    private int iSize;

    // Used when moving through the list
    private Node currNode;

    // Stores the node before the current node
    private Node prevNode;

    // Constructor that creates an empty linked list
    public SLList() {
        head = null;
        iSize = 0;
        currNode = null;
        prevNode = null;
    }

    // Checks if the linked list is empty
    @Override
    public boolean isEmpty() {
        return iSize == 0;
    }

    // Returns the number of elements currently in the list
    @Override
    public int size() {
        return iSize;
    }

    // Adds an element at a specific position in the list
    @Override
    public void add(int iPosition, Object theElement) {

        // Special case: inserting at the first position (head)
        if (iPosition == 1) {
            Node newNode = new Node(theElement, head);
            head = newNode;
        } 
        else {
            // Move to the correct position in the list
            setCurrent(iPosition);

            // Create the new node and link it into the list
            Node newNode = new Node(theElement, currNode);
            prevNode.setNext(newNode);
        }

        // Increase the size of the list
        iSize++;
    }

    // Adds an element to the end of the list
    @Override
    public void add(Object theElement) {

        // Create the new node
        Node newNode = new Node(theElement, null);

        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
        } 
        else {
            // Move to the last node
            setCurrent(iSize);

            // Link the new node at the end
            currNode.setNext(newNode);
        }

        // Increase the list size
        iSize++;
    }

    // Returns the element stored at a given position
    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode.getElement();
    }

    // Removes the node at a specific position
    @Override
    public void remove(int iPosition) {

        // Special case: removing the first node
        if (iPosition == 1) {
            head = head.getNext();
        } 
        else {
            // Find the correct node
            setCurrent(iPosition);

            // Skip over the node to remove it
            prevNode.setNext(currNode.getNext());
        }

        // Decrease the size of the list
        iSize--;
    }

    // Updates the element stored at a specific position
    public void set(int iPosition, Object newElement) {

        // Move to the correct node
        setCurrent(iPosition);

        // Replace the element stored in that node
        currNode.setElement(newElement);
    }

    // Searches the list for a specific value
    // Returns the position if found, otherwise returns -1
    public int search(Object target) {

        Node tempNode = head;
        int pos = 1;

        // Traverse the list until the end is reached
        while (tempNode != null) {

            // Check if the element matches the search value
            if (tempNode.getElement().toString().equalsIgnoreCase(target.toString())) {
                return pos;
            }

            tempNode = tempNode.getNext();
            pos++;
        }

        // If the item was not found
        return -1;
    }

    // Returns the contents of the list as a string
    // Used to display the list in the GUI
    public String displayList() {

        String output = "";
        Node tempNode = head;
        int pos = 1;

        // Go through each node in the list
        while (tempNode != null) {

            // Add each element to the output string
            output += "Position " + pos + ": " + tempNode.getElement().toString() + "\n";

            tempNode = tempNode.getNext();
            pos++;
        }

        return output;
    }

    // Moves through the list to find a specific position
    // Sets currNode to the current node and prevNode to the previous node
    private void setCurrent(int iPosition) {

        int iCount;
        prevNode = null;
        currNode = head;

        // Traverse the list until the correct position is reached
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    // Prints the list to the console
    // Mainly used for testing purposes
    @Override
    public void printList() {

        Node tempNode = head;

        // Go through each node and print its contents
        while (tempNode != null) {
            System.out.println(tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
}
