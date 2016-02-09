/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

/**
 *
 * @author S.Rahman
 */
public class UseBoxing {
    public static void main(String args[]){
        UseBoxing u = new UseBoxing();
        u.go(5);
    }
    
    boolean go(Integer i){
        Boolean ifSo = true;
        Short s = 300;
        if(ifSo){
            System.out.println(++s);
//            System.out.println("hello");
        }
        return !ifSo;
    }
}
