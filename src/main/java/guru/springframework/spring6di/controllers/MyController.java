package guru.springframework.spring6di.controllers;

// created by kp on 3/18/2023

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("I'm in the controller");
        return "Hello Everyone!!!";
    }
}
