/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter13;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SAMI
 */
public class NameRunnable implements Runnable{

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<4;i++){
            System.out.println("Run by " + Thread.currentThread().getName());
            try {
                Thread.sleep(5*1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NameRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

class NameRunnableImplementation{
    public static void main(String[] args) {
        NameRunnable nr = new NameRunnable();
        
        Thread one = new Thread(nr);
        one.setName("Fred");
        Thread two = new Thread(nr);
        two.setName("Lucy");
        Thread three = new Thread(nr);
        three.setName("Ricky");
        
        one.start();
        two.start();
        three.start();
    }
}
