package com.test.demo.message.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class BetMessage  extends BaseMessage {


    private Integer bettingNumber;
}
