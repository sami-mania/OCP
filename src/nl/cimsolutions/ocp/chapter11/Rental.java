/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.List;

/**
 *
 * @author SAMI
 */
public class Rental {
    private List rentalPool;
    private int maxNum;

    public Rental(List rentalPool, int maxNum) {
        this.rentalPool = rentalPool;
        this.maxNum = maxNum;
    }

    public Object getRental() {
        return rentalPool.get(0);
    }

    public void returnRental(Object o) {
        rentalPool.add(o);
    }    
}

class CarRental extends Rental{

    public CarRental(List<Car> rentalPool, int maxNum) {
        super(rentalPool, maxNum);
    }
     public Car getRental(){
         return (Car)super.getRental();
     }   
     
     public void returnRental(Car c){
         super.returnRental(c);
     }
     public void returnRental(Object o){
         if(o instanceof Car)
             super.returnRental(o);
         else
             System.out.println("Cannot add a non-Car");
     }
    }
