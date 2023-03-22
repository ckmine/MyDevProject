package com.sk.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.sk.config.UiApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UiApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class UiIntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {

    }
}
