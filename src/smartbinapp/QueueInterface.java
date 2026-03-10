/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartbinapp;

/**
 *
 * @author ikram
 */
public interface QueueInterface {

    public boolean isEmpty();

    public void enqueue(Object element);

    public Object dequeue();
    
}
