
import java.util.ArrayList;

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

public class MyQueue implements QueueInterface{//start class
    //creating array list queue
    private ArrayList <Patient> theQueue;

    public MyQueue(){
        theQueue = new ArrayList <Patient>();
    }//end my queue method

    public boolean isEmpty() {
        return theQueue.isEmpty();
    }//end check if empty method

    public int size() {
        return theQueue.size();
    }//end size method

    public Object frontElement() {
        if(!theQueue.isEmpty()){
            return theQueue.get(0);
        }//end if
        else{
            return null;
        }//end else
    }//end front element

    public void enqueue(Object newItem) {
        theQueue.add((Patient)newItem);
    }//end enqueue

    public Object dequeue() {
        if(!theQueue.isEmpty()){
            return theQueue.remove(0);
        }//end if
        else{
            return null;
        }//end else
    }//end dequeue

}//end class
