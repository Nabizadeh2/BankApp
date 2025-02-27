package com.atl23.bankapp.config;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQProducer<T> {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(T message){
       // Message msg= MessageBuilder.withBody(message.getBytes()).build();
        rabbitTemplate.convertAndSend("userQueue",message);
        System.out.println("Send Message : " + message);
    }
}
