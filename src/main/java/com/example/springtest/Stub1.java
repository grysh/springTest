package com.example.springtest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stub1 implements Stub {
    @Override
    public void doSomeLogic() {
        log.info("stub 1");
    }
}
