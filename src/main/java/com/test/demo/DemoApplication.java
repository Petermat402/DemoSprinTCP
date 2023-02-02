package com.test.demo;

import com.test.demo.message.SendMessageHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.config.EnableMessageHistory;
import org.springframework.messaging.SubscribableChannel;

@SpringBootApplication
@EnableMessageHistory
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        SubscribableChannel observeChannel = context.getBean("observeChannel", SubscribableChannel.class);
        observeChannel.subscribe(new SendMessageHandler());


//        context.close();
    }



    @Bean
    public SubscribableChannel observeChannel() {
        return new PublishSubscribeChannel();
    }

}
