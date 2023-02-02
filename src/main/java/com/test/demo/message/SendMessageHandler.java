package com.test.demo.message;


import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

public class SendMessageHandler implements MessageHandler {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void handleMessage(@NotNull Message<?> message) throws MessagingException {

        logger.info("Received  " + message.toString());
        logger.info("Number is  " + message.getPayload().toString());

    }
}
