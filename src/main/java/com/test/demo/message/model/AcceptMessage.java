package com.test.demo.message.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class AcceptMessage extends BaseMessage {

    private Integer lowerEndRange;
    private Integer upperEndRange;
}
