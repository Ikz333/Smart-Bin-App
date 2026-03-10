/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
public interface StackInterface {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

}
