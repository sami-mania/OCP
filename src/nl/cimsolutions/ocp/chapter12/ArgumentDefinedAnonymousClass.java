/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter12;

/**
 *
 * @author SAMI
 */
public class ArgumentDefinedAnonymousClass {
    void go(){
        Bar b = new Bar();
        b.doStuff(new Foo(){
            @Override
            public void foof(){
                System.out.println("foofy");
            }
        });
    }
}

interface Foo{
    void foof();
}

class Bar{
    void doStuff(Foo f){
    }
}