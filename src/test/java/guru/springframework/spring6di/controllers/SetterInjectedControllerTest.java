package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * created by R. Ammon
 */
class SetterInjectedControllerTest {
  SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() {
    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void sayHello() {
    System.out.println(setterInjectedController.sayHello());
  }
}