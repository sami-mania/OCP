/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;
/**
 *
 * @author SAMI
 */
public class ParameterizedGenericClassTest<T,X> {
    T one;
    X two;

    public ParameterizedGenericClassTest(T one, X two) {
        this.one = one;
        this.two = two;
    }
    
    T getT(){
        return one;
    }
    
    X getX(){
        return two;
    }
    
    public static void main(String[] args) {
        ParameterizedGenericClassTest<String, Integer> twos = new ParameterizedGenericClassTest<String, Integer>("foo", 42);
        String str = twos.getT();
        int value = twos.getX();
        System.out.println("String: " + str + "\n" + "int value: " + value);
    }
}
