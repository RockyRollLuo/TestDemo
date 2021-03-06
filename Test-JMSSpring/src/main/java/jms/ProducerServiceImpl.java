package jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by luoqi3 on 2017/11/29.
 */
public class ProducerServiceImpl implements ProducerService{

    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name="queueDestination")
    Destination destination;

    public void sendMessage(final String message) {
        try {
            jmsTemplate.send(destination, new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    TextMessage textMessage=session.createTextMessage(message);
                    System.out.println("发送消息："+textMessage.getText());
                    return textMessage;
                }
            });
        } catch (JMSException e) {
            System.out.println(e);
        }

        System.out.println("发送消息："+message);
    }

}
