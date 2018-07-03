/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springamqp.activemq;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jagadheesan Balu
 */
@Component
public class ActiveMQMessageListener implements MessageListener {
    
    @Autowired
    private AtomicInteger counter = null;
    
    public void onMessage(Message msg) {
        
        try {
            if(msg instanceof TextMessage) {
             TextMessage txtMsg = (TextMessage) msg;
                
                    System.out.println("Received message from destination :"+txtMsg.getText());
                    
                    counter.incrementAndGet();
                }
            } catch (JMSException ex) {
                    System.out.println("Exception caught :"+ex.getMessage());
                }
       
    }
}
