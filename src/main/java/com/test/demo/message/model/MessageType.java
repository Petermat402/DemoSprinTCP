package com.test.demo.message.model;

public enum MessageType {
    BEGASEP_OPEN(0),
    BEGASEP_ACCEPT(1),
    BEGASEP_BET(2),
    BEGASEP_RESULT(3);

    private int numberType;

    private MessageType(final int numberType) {
        this.numberType = numberType;
    }
}
