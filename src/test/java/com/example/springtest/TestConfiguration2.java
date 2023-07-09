package com.example.springtest;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfiguration2 {

    @Bean
    public Stub getStub2() {
        return new Stub2();
    }
}
