package com.test.demo.message.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Header {

    private Integer version;
    private Integer length;
    private Integer type;
    private Integer clientId;
}
