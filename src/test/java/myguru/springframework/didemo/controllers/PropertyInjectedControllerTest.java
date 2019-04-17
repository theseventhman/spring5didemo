package myguru.springframework.didemo.controllers;

import myguru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGretting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,this.propertyInjectedController.sayHello());
    }
}