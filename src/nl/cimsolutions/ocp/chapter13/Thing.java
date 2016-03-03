/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter13;

/**
 *
 * @author SAMI
 */
public class Thing {
    private static int staticField;
    private int nonStaticField;
    
    public static synchronized int getStaticField(){
        return staticField;
    }
    
    public static synchronized void setStaticField(){
        Thing.staticField = staticField;
    }
    
    public synchronized int getNonstaticField(){
        return nonStaticField;               
    }
    
    public synchronized void setNonStatticField(){
        this.nonStaticField = nonStaticField;
    }
}
