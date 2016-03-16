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
public class NewClass {
    public int fact(int f){
       if(f <= 0){
           return 1;
       }
       else
           return f*fact(f-1);
    }
}
