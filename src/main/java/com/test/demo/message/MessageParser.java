package com.test.demo.message;

import com.test.demo.message.model.AcceptMessage;
import com.test.demo.message.model.BaseMessage;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.ArrayList;

@Component
public class MessageParser {

    public BaseMessage parseInbound(byte[] incomingMessage) {
        //*WIP*
        return AcceptMessage.builder().build();
    }

    public byte[] parseOutbound(BaseMessage outgoingMessage) {
       //*WIP*
    }
}
