/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springamqp.activemq;

/**
 *
 * @author Jagadheesan Balu
 */
public class IncrementClass {
    
    public void doInc (){
        for(int i=1;i<=10;i++) {
            CounterClass.no = i;
            System.out.println("inc :"+CounterClass.no);
        }
        
    }
    
}
