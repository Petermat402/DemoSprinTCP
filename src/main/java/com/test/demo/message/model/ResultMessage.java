package com.test.demo.message.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ResultMessage  extends BaseMessage {

    private Integer status;
    private Integer winningNumber;
}
