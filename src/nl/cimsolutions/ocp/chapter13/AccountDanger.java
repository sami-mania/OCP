/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter13;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.SunGraphicsCallback;

/**
 *
 * @author SAMI
 */
class Account {
    private int balance = 50;
    
    public int getBalance(){
        return balance;
    }
    
    public void withdraw(int amount){
        balance = balance - amount;
    }    
}

public class AccountDanger implements Runnable{

    private Account accnt = new Account();
    
    public static void main(String args[]){
        AccountDanger r = new AccountDanger();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }
    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<5;i++){
            makeWithdrawal(10);
            if(accnt.getBalance() < 0)
                System.out.println("account is overdrawn");
        }
    }
    
    private void makeWithdrawal(int amt){
        if(accnt.getBalance() >= amt){
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(AccountDanger.class.getName()).log(Level.SEVERE, null, ex);
            }
            accnt.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");            
        }else{
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + accnt.getBalance());
            
        }
    }
    
}