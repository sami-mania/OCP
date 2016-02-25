/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter13;

/**
 *
 * @author S.Rahman
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("NameRunnable running");        
        for(int i=1;i<=5;i++){
//            System.out.println("Runnable : " + i);
            System.out.println("Run by " + Thread.currentThread().getName() + " , x is " + i + ", Thread ID " + Thread.currentThread().getId() + Thread.currentThread().getId());
        }
    }   
}

class TestRunnable{
    public static void main(String[] args) {
        System.out.println("From the Thread: " + Thread.currentThread().getName());
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);                
        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t3.setName("3rd Thread");
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.start();
    }
}