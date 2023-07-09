package com.example.springtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestConfiguration1.class)
public class Test1 {

    @Autowired
    private Stub stub;

    @Test
    public void testStubSomeLogic() {
        stub.doSomeLogic();
    }
}
