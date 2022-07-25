package guru.sringframework.sfgdi.controllers;

import static org.mockito.ArgumentMatchers.contains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.sringframework.sfgdi.services.ConstructorGreetingService;

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting() + " This test");
    }
}
