package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * created by R. Ammon
 */
@Controller
public class SetterInjectedController {

  private GreetingService greetingService;

  @Qualifier("propertyGreetingService")
  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
