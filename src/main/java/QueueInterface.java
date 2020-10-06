/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordan Student No. x19103310
 * 
 */
public interface QueueInterface {//start class
    
    //queue methods
    public boolean isEmpty();
    public int size();
    public Object frontElement();
    public void enqueue(Object newItem);
    public Object dequeue();   
    
}//end class
