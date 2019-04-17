package myguru.springframework.didemo.controllers;

import myguru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {
private ConstructorInjectedController constructorInjectedController;
    @Before
    public void setUp() throws Exception {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,constructorInjectedController.sayHello());
    }
}