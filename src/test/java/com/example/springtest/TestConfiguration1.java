package com.example.springtest;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfiguration1 {

    @Bean
    public Stub getStub1() {
        return new Stub1();
    }
}
