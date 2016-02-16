/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author S.Rahman
 */
class Dog{
    public String name;
    Dog(String n){
        name=n;
    }
}

public class IteratorTest {
    public static void main(String args[]){
        List<Dog> d = new ArrayList<Dog>();
        Dog dog= new Dog("aiko");
        d.add(dog);
        d.add(new Dog("clover"));
        d.add(new Dog("magnolia"));
        Iterator<Dog> i3 = d.iterator();     //make an Iterator
        while(i3.hasNext()){
            Dog d2 = i3.next();              //cast not required
            System.out.println(d2.name);
        }
        
        System.out.println("size: " + d.size());
        System.out.println("get_element_1: " + d.get(1).name);
        System.out.println("aiko: " + d.indexOf(dog));
        d.remove(2);
        
        Object[] oa = d.toArray();
        for(Object o: oa){
            Dog d2 = (Dog)o;
            System.out.println("oa " + d2.name);
        }
    }       
}