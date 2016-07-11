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
interface Hungry<E>{
    void munch(E e);
}

interface Carnivore<E extends Animal> extends Hungry<E>{
}

interface Herbivore<E extends Animal> extends Hungry<E>{
}

abstract class Plant{
    
}

class Grass extends Plant{
}

abstract class Animal{
}

class Sheep extends Animal implements Herbivore<Sheep>{
    @Override
    public void munch(Sheep e){
    }
}

class Wolf extends Animal implements Carnivore<Sheep>{
    
}



public class Question6 {
    
}
