package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * created by R. Ammon
 */
@Controller
public class PropertyInjectedController {
  GreetingService greetingService;

  public  String sayHello() {
    return greetingService.sayGreeting();
  }


}
