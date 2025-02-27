package com.atl23.bankapp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue exampleQueue() {
        return new Queue("userQueue", true); // "userQueue" adında bir queue yaradır
    }
}