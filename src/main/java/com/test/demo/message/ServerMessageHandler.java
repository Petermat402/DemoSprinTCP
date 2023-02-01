package com.test.demo.message;


import com.test.demo.message.model.BaseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
@MessageEndpoint
public class ServerMessageHandler {

    @Autowired
    MessageParser messageParser;

    @ServiceActivator(inputChannel = "fromTcp")
    public byte[] handleMessage(byte[] msg, MessageHeaders messageHeaders) {
        String string = new String(msg);
        System.out.println(string);

        BaseMessage message = messageParser.parseInbound(msg);
        // TODO implement some buisiness logic here
        return msg;
    }

}
