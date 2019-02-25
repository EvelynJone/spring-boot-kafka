/*
 * File Name:Application is created on 2019/2/2511:16 AM by Zhao Xiaoli
 *
 * Copyright (c) 2019, xiaoyujiaoyu technology All Rights Reserved.
 *
 */
package com.spring.boot.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @author Zhao Xiaoli
 * @Description : Application
 * @date 2019/2/25 11:16 AM
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableKafka
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
