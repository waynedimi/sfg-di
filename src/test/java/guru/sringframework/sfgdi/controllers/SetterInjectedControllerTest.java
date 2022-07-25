package guru.sringframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.sringframework.sfgdi.services.ConstructorGreetingService;

public class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setup(){

        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());

    }
    @Test
    void testGetGreeting() {
        //controller.getGreeting();

        System.out.println(controller.getGreeting() + " Test 2");

    }

}
