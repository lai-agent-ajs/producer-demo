package com.learnable.consumerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ProducerController {


    @Value("${producer-age}")
    private String producerAge;

    @GetMapping("/testProducer")
    public String testProducer(String consumerName, String consumerAge) {
        return "Hi " + consumerName + "(age:" + consumerAge + "), I am producer(age:" + producerAge + ").";
    }
}
