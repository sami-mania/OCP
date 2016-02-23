/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter12;

//import nl.cimsolutions.ocp.chapter12.Broom.B2;

/**
 *
 * @author SAMI
 */
public class StaticNestedClass {
    static class B2{
        void goB2(){
            System.out.println("hi in static B2 class");
        }
    }
    
    public static void main(String[] args) {
        BigOuter.Nest n = new BigOuter.Nest();
        n.go();
        B2 b2 = new B2();
        b2.goB2();
    }
}

class BigOuter{
    static class Nest{
        void go(){
            System.out.println("hi in static Nest class");
        }
    }
}

class Broom{
    
}
