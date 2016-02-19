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
 * @author S.Rahman
 */
public class AnimalDoctorGeneric {
    
    public void checkAnimals(ArrayList<Animal> animals){
        for(Animal a: animals){
            a.checkup();
        }
    }
    
    public void addAnimal(List<Animal> animals){
        animals.add(new Dog2());
    }
    
    public static void main(String args[]){
        List<Animal> ani = new ArrayList<Animal>();
        ani.add(new Dog2());
        ani.add(new Cat2());
        
        List<Dog2> dog2ref = new ArrayList<Dog2>();
        dog2ref.add(new Dog2());
        dog2ref.add(new Dog2());
        
        List<Dog2> dogs = new ArrayList<Dog2>();
        dogs.add(new Dog2());
        dogs.add(new Dog2());
        
        List<Cat2> cats = new ArrayList<Cat2>();
        cats.add(new Cat2());
        cats.add(new Cat2());
        cats.add(new Cat2());

        List<Bird> birds = new ArrayList<Bird>();
        birds.add(new Bird());
        
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
//        doc.checkAnimals(dogs);
//        doc.checkAnimals(cats);
//        doc.checkAnimals(birds);
        
//        doc.checkAnimals((ArrayList<Animal>) ani);
        
        doc.addAnimal(ani);
        
//        doc.addAnimal(dog2ref);
    }
}
