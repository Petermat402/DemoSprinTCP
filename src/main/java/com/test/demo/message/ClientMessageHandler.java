package com.test.demo.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
@MessageEndpoint
public class ClientMessageHandler {

    @Autowired
    MessageParser messageParser;

    @ServiceActivator(inputChannel = "toTcp")
    public byte[] handleMessage(byte[] msg, MessageHeaders messageHeaders) {
        String string = new String(msg);
        System.out.println(string);

        byte[] message = messageParser.parseOutbound(null);
        // TODO implement some buisiness logic here
        return msg;
    }
}
