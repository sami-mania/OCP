/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter07;

import java.io.IOException;

/**
 *
 * @author S.Rahman
 */
public class SuppressedExceptions {
    public static void main(String[] args) {
        try(One one = new One();){
            throw new Exception("try");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            for( Throwable t: e.getSuppressed()){
                System.out.println("suppressed: " + t);
            }
        }
    }
}

class One implements AutoCloseable{
    @Override
    public void close() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        throw new IOException("Closing");
    }
}

