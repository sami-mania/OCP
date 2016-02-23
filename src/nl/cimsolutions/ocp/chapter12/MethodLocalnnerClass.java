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
public class MethodLocalnnerClass {
    private String x = "Outer";
    
    void doStuff(){    
//        String z = "local variable";        
        final String z = "local variable";
        class MyInner{
            public void seeOuter(){
                System.err.println("Outer2 x is: " + x);
                System.out.println("Local variable z: " + z);       // because local variable lives in the stack for some time while//
                                                                    // the method is alive on the stack. 
                                                                    // but class object lives in the heap as long as the class alive.
            }       //close inner class method
        }           //close inner class definitino
        
        MyInner mi = new MyInner();
        mi.seeOuter();
    }               //close outer class method doStuff()
}                   //close outer class