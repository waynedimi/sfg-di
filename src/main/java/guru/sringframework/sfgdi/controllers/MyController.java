package guru.sringframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.sringframework.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
    
}
