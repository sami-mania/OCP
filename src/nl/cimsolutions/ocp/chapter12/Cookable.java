/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter12;

import java.awt.BorderLayout;

/**
 *
 * @author SAMI
 */
public interface Cookable{
    public void cook();
}

class Food2 {
    Cookable c = new Cookable() {

        @Override
        public void cook() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
            System.out.println("annonymous cookable implementer");
        }
    };
}
