/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter13.selftest;

/**
 *
 * @author SAMI
 */
public class Question11 {
    synchronized void a(){
        actBusy();
    }
    
    static synchronized void b(){
        actBusy();
    }
    
    static void actBusy(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
        }
    }
    
    public static void main(String[] args) {
        final Question11 x = new Question11();
        final Question11 y = new Question11();
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  int option = (int)(Math.random() * 4);
                  switch(option){
                      case 0: x.a();
                      break;
                      case 1: x.b();
                      break;
                      case 2: y.a();
                      break;
                      case 3: y.b();
                      break;
                  }
            }
        };
        
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
