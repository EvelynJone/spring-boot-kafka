/*
 * File Name:HomeController is created on 2019/2/2511:18 AM by Zhao Xiaoli
 *
 * Copyright (c) 2019, xiaoyujiaoyu technology All Rights Reserved.
 *
 */
package com.spring.boot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhao Xiaoli
 * @Description : HomeController
 * @date 2019/2/25 11:18 AM
 * @since JDK 1.8
 */
@RestController
public class HomeController {

    @Autowired
    private KafkaTemplate<String,String> template;

    @RequestMapping("index")
    public String index() {
        template.send("kafka-topic-index","kafka message " + Math.random());
        return "index";
    }

}
