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

abstract class Animal{
    public abstract void checkup();
}

class Dog2 extends Animal{

    @Override
    public void checkup() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Dog2 checkup");
    }
}

class Cat2 extends Animal{

    @Override
    public void checkup() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cat2 checkup");
    }
    
}

class Bird extends Animal{

    @Override
    public void checkup() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Bird checkup");
    }
}

public class AnimalDoctor {
    
    public void checkAnimals(Animal [] animals){
        for(Animal a: animals){
            a.checkup();
        }
    }
    
    public static void main(String args[]){
        Dog2 [] dogs = {new Dog2(),new Dog2()};
        Cat2 [] cats = {new Cat2(), new Cat2(), new Cat2()};
        Bird [] birds = {new Bird()};
        
        AnimalDoctor doc = new AnimalDoctor();
        doc.checkAnimals(dogs);             //pass the Dog[]
        doc.checkAnimals(cats);             //pass the Cat[]
        doc.checkAnimals(birds);            //pass the birds[]        
    }
}
