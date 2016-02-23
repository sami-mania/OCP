/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter12;

/**
 *
 * @author SAMI
 */
public class Popcorn {
    public void pop(){
        System.out.println("popcorn");
    }
}

class Food {
    Popcorn p = new Popcorn(){
        public void sizzle(){
            System.out.println("Anonymous sizzling popcorn");
        }
        @Override
        public void pop(){
            System.out.println("anonymous popcorn");
        }
    };
    
    public void popIt(){
        p.pop();
//        p.sizzle();     //because class Popcorn does not have sizzle() method.
                          //for anonymous class, super class must have the method that can be called by anonymous subclass
    }
}