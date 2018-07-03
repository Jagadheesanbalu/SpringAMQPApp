/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.springamqp.activemq;

import javax.annotation.PostConstruct;
import javax.jms.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jagadheesan Balu
 */
@Component
public class ActiveMQMessageProducer {
    
    protected static final String MSG_COUNT = "messageCount";
    
    int msgCount = 0;
    
    @Autowired
    private JmsTemplate jmsTempate = null;
    
    @PostConstruct
    public void generateMessages() {
        for( ;msgCount < 10; msgCount ++) {
            final String text = "TP Message " + msgCount;
            
            jmsTempate.send(new MessageCreator() {

                @Override
                public Message createMessage(Session sn) throws JMSException {
                    TextMessage txtMsg = sn.createTextMessage(text);
                    txtMsg.setIntProperty(MSG_COUNT, msgCount);
                    return txtMsg;
                }
            });
        }
       
    }
}
