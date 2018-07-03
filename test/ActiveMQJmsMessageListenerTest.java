/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.practice.springamqp.activemq.ActiveMQMessageListener;
import com.practice.springamqp.activemq.CounterClass;
import java.util.concurrent.atomic.AtomicInteger;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Jagadheesan Balu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ActiveMQJmsMessageListenerTest {
    
    @Autowired
    private AtomicInteger counter = null;
    
    @Test
    public void testMessage() throws InterruptedException {
        
        Thread.sleep(5000);
        assertEquals (10, counter.get());
      
    }
}