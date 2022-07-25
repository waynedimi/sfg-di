package guru.sringframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.sringframework.sfgdi.services.ConstructorGreetingService;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }
    @Test
    void testGetGreeting() {

        System.out.println(controller.getGreeting() + " Test 3");

    }
}
