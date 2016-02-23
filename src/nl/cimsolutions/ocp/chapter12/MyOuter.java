/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter12;

import nl.cimsolutions.ocp.chapter12.MyOuter.MyInner;

/**
 *
 * @author SAMI
 */
public class MyOuter {

    private int x=7;  
//    MyOuter mo1 = new MyOuter();
    
    public void makeInner(){
        MyInner in = new MyInner();
        in.seeOuter();
        System.out.println("From Outer ref: " + this);
        System.out.println("From outer ref: " + MyOuter.this);
    }
        
    class MyInner{
        
        public void seeOuter(){
            System.out.println("Outer x is: " + x);
            System.out.println("Inner class ref is: " + this);
            System.out.println("Inner class ref is: " + MyInner.this);    // this and MyInner.this     is same 
            System.out.println("Outer class ref is: " + MyOuter.this);            
        }
    } 
    
    public static void main(String[] args) {
        MyOuter mo = new MyOuter();
        MyOuter.MyInner inner = mo.new MyInner();
        inner.seeOuter();
    }
}
