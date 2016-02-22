/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SAMI
 * @param <R>
 */
public class RentalGeneric<R> {
    private List<R> rentalPool;
    private int maXNum;
    public RentalGeneric(int maxNum,List<R> rentalPool){
        this.maXNum = maxNum;
        this.rentalPool = rentalPool;
    }
    
    public R getRental(){
        return rentalPool.get(0);
    }
    
    public void returnRental(R returnedThing){
        
    }
}

class TestRentalGeneric{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2();
        
        List<Car2> carList = new ArrayList<Car2>();
        carList.add(c1);
        carList.add(c2);
        
        RentalGeneric<Car2> carRental = new RentalGeneric<Car2>(2, carList);
        Car2 carToRent = carRental.getRental();
        carRental.returnRental(carToRent);
//        carList.add(new Cat2());
                
    }
}

class Car2{
}
