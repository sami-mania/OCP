/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter13;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author SAMI
 */
public class NameListSynchronized {
//    private List names = Collections.synchronizedList(new LinkedList());
    private List names = new LinkedList();
    
    public synchronized void add(String name){       
        names.add(name);
    }
    
    public synchronized String removeFirst(){
         if(names.size() > 0)
            return (String) names.remove(0);
        else
            return null;
    }
    
    public static void main(String args[]){
        final NameListSynchronized nl = new NameListSynchronized();
        nl.add("Ozymandias");
        
        class NameDropper extends Thread{
            @Override
            public void run(){
                String name = nl.removeFirst();
                System.out.println(name);
            }
        }
        
        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();
        
        t1.start();
        t2.start();
    }
}