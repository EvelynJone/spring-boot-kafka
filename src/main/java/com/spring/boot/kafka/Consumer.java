/*
 * File Name:Consumer is created on 2019/2/252:20 PM by Zhao Xiaoli
 *
 * Copyright (c) 2019, xiaoyujiaoyu technology All Rights Reserved.
 *
 */
package com.spring.boot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Zhao Xiaoli
 * @Description : Consumer
 * @date 2019/2/25 2:20 PM
 * @since JDK 1.8
 */
@Component
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = {"kafka_topic_index"})
    public void consumer(String message) {
        LOGGER.info("consumer a message : {} ",message);
    }
}

