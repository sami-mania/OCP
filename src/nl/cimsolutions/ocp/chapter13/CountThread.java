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
public class CountThread extends Thread{

    @Override
    public void run() {
//        super.run(); //To change body of generated methods, choose Tools | Templates.
        for(int i=0; i<100; i++){
            if(i%10 == 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CountThread.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            }
        }
    }
    
}