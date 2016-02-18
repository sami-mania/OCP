/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter11;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author S.Rahman
 */
public class PriorityQueueTest {
    
    static class PQSort implements Comparator<Integer>{

        @Override
        public int compare(Integer one, Integer two) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return two - one;
        }
        
    }
    
    public static void main(String args[]){
        int [] ia = {1,5,3,7,6,9,8};
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        
//        for(int x: ia)
//            System.out.print(pq1.peek()+ " ");
//        System.out.println("\n");
//        for(int x: ia)
//            System.out.print(pq1.poll() + " ");
//        System.out.println("\n");
        
        for(int x : ia)                 // load queue
            pq1.offer(x);
        for(int x: ia)                  //review queue
            System.out.print(pq1.poll()+ " ");
        System.out.println("\n");
        
//        for(int x: ia)                  //review queue
//            System.out.print(pq1.peek() + " ");
//        System.out.println("\n");
//        
        PQSort pqs = new PQSort();
        
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, pqs);
        
        for(int x: ia)
            pq2.offer(x);
//        for(int x: ia)
//            System.out.print(pq1.poll() + " ");
//        System.out.println("\n");
//        for(int x: ia)
//            System.out.print(pq2.peek() + " ");
//        System.out.println("\n");
        
        System.out.println("size: " + pq2.size());
        System.out.println("peek: " + pq2.peek());
        System.out.println("size: " + pq2.size());
        System.out.println("poll: " + pq2.poll());
        System.out.println("size: " + pq2.size());
        System.out.println("\n");
        
        for(int x: ia)
            System.out.print(pq2.poll() + " ");
        System.out.println("\n");
        
    }
}
