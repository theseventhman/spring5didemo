package myguru.springframework.didemo.controllers;

import myguru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class myController {
    private GreetingService greetingService;

    public myController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }
}
