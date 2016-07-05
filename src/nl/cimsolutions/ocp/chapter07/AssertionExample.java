/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter07;

/**
 *
 * @author S.Rahman
 */
public class AssertionExample {
    
    void noRreturn(){
        
    }
    
    int aReturn(){
        return 1;
    }
    
    void go(){
        int x=1;
        boolean b = true;
        assert(x==1);
        assert(b);
        assert true;
        assert(x == 0): x;
        assert(x == 1): aReturn();
        assert(x == 1): new AssertionExample();
        
        
    }
    public static void main(String args[]){
        new AssertionExample().go();
    }
}
