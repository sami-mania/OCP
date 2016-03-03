/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter13;

/**
 *
 * @author SAMI
 */
public class DeadLockList {
    private static class Resource{
        public int value;
    }
    
    private Resource resourceA = new Resource();
    private Resource resourceB = new Resource();
    
    public int read(){
        synchronized(resourceA){        //may Deadlock here
            synchronized(resourceB){
                return resourceB.value + resourceA.value;
            }
        }
    }
    
    public void write(int a, int b){
        synchronized(resourceB){
            synchronized(resourceA){
                resourceA.value = a;
                resourceB.value = b;
            }
        }
    }
}
