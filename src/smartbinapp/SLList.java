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

    private Node head;
    private int iSize;
    private Node currNode;
    private Node prevNode;

    public SLList() {
        head = null;
        iSize = 0;
        currNode = null;
        prevNode = null;
    }

    @Override
    public boolean isEmpty() {
        return iSize == 0;
    }

    @Override
    public int size() {
        return iSize;
    }

    @Override
    public void add(int iPosition, Object theElement) {
        if (iPosition == 1) {
            Node newNode = new Node(theElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            Node newNode = new Node(theElement, currNode);
            prevNode.setNext(newNode);
        }
        iSize++;
    }

    @Override
    public void add(Object theElement) {
        Node newNode = new Node(theElement, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            currNode.setNext(newNode);
        }
        iSize++;
    }

    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode.getElement();
    }

    @Override
    public void remove(int iPosition) {
        if (iPosition == 1) {
            head = head.getNext();
        } else {
            setCurrent(iPosition);
            prevNode.setNext(currNode.getNext());
        }
        iSize--;
    }

    public void set(int iPosition, Object newElement) {
        setCurrent(iPosition);
        currNode.setElement(newElement);
    }

    public int search(Object target) {
        Node tempNode = head;
        int pos = 1;

        while (tempNode != null) {
            if (tempNode.getElement().toString().equalsIgnoreCase(target.toString())) {
                return pos;
            }
            tempNode = tempNode.getNext();
            pos++;
        }

        return -1;
    }

    public String displayList() {
        String output = "";
        Node tempNode = head;
        int pos = 1;

        while (tempNode != null) {
            output += "Position " + pos + ": " + tempNode.getElement().toString() + "\n";
            tempNode = tempNode.getNext();
            pos++;
        }

        return output;
    }

    private void setCurrent(int iPosition) {
        int iCount;
        prevNode = null;
        currNode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    @Override
    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
}
