package guru.springframework.spring6di.controllers;

// created by kp on 3/19/2023

import guru.springframework.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
