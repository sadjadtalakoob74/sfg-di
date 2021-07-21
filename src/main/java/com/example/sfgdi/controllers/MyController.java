package com.example.sfgdi.controllers;

import com.example.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final PrimaryGreetingService greetingService;

    public MyController(PrimaryGreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
