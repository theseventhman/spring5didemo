package myguru.springframework.didemo.controllers;

import myguru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetterInjectedControllerTest {
private GetterInjectedController getterInjectedController;
    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,this.getterInjectedController.sayHello());

    }
}