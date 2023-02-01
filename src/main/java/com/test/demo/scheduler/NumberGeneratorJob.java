package com.test.demo.scheduler;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.support.GenericMessage;

import java.util.Map;
import java.util.Random;

public class NumberGeneratorJob implements Job {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    QueueChannel outputChannel;

    @Value("${BEGASEP_NUM_MIN}")
    Long minNumber;

    @Value("${BEGASEP_NUM_MAX}")
    Long maxNumber;

    @Override
    public void execute(JobExecutionContext context) {
        final Random random = new Random();
        final Long number = random.nextLong(minNumber, maxNumber);
        final GenericMessage<Long> message = new GenericMessage<>(number, Map.of());
        logger.info(message.getPayload().toString());
        outputChannel.send(message);
    }
}
