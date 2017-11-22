package com.rocky.jms.queue;

/**
 * Created by luoqi3 on 2017/11/12.
 * 需要开启D:\SoftwareInstall\apache-activemq-5.15.2\bin\win64\activemq.bat
 * 或者点击apache-activemq-5.15.2\bin\win64\InstallService.bat,再在电脑服务中开启ActiveMQ服务
 */

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 生产者
 */
public class AppProducer {

    private static final String url="tcp:127.0.0.1:61616";
    private static final String QueueName="queue-test";


    public static void main(String[] args) throws JMSException {
        //1.创建链接工厂
        ConnectionFactory connectionFactory=new ActiveMQConnectionFactory(url);

        //2.创建链接
        Connection connection=connectionFactory.createConnection();

        //3.启动链接
        connection.start();

        //4.创建会话
        Session session=connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        //5.创建一个目标
        Destination destination=session.createQueue(QueueName);

        //6.创建一个生产者
        MessageProducer producer=session.createProducer(destination);

        for(int i=0;i<100;i++){
            //7.创建消息
            TextMessage textMessage=session.createTextMessage("test"+i);
            //8.发布消息
            producer.send(textMessage);

            System.out.println("Send Message:"+textMessage.getText());
        }

        //9.关闭
        connection.close();
    }




}
