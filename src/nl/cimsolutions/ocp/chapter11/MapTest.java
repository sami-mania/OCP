/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author S.Rahman
 */
class Car{
    public String name;
    public Car(String n){
        name = n;
    }
    
    @Override
    public boolean equals(Object o){
        if((o instanceof Car) && ((Car)o).name == name){
            return true;
        }
        else {
            return false;
        }
    }
    
    public int hasCode(){
        return name.length();
    }
}

class Truck{
    
}

enum Vehicle{Car, Truck, Bus}

public class MapTest {
    public static void main(String args[]){
        Map<Object, Object> m = new HashMap<Object, Object>();
        System.out.println(m.size());
        
        System.out.println(m.isEmpty());
        m.put("k1", new Car("BMW"));        // add some key/value pairs
        m.put("k2", Vehicle.Car);
        m.put(Vehicle.Truck, "Truck key");
        Car c1 = new Car("Renault");        // let's keep this reference
        m.put(c1, "Car key");
        m.put(new Truck(), "Truck key");
        
        System.out.println(m.get("k1"));
        String k2 = "k2";
        System.out.println(m.get(k2));
        Vehicle v = Vehicle.Truck;
        System.out.println(m.get(v));
        System.out.println(m.get(c1));
        System.out.println(m.get(new Truck()));
        System.out.println(m.size());
        
    }
}
