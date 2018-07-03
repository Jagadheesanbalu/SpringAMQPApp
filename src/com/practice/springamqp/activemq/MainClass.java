/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springamqp.activemq;

import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jagadheesan Balu
 */
public class MainClass {
    
    public static void main(String arg[]) throws InterruptedException{
        
         ApplicationContext cxt = new ClassPathXmlApplicationContext("ActiveMQJmsMessageListenerTest-context.xml");
        
        AtomicInteger counter = (AtomicInteger) cxt.getBean("counter");
        
        //System.out.println("Final :"+counter.get());
        
        Thread.sleep(5000);
        System.out.println("Final :"+counter.get());
    }
    
}
