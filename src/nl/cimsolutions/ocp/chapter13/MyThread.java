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
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Important job running in MyThreads");
    }
    
    public void run(String s){
        System.out.println("String in run is: " + s);
    }
}
