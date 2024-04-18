package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * created by R. Ammon
 */
@Controller
public class MyController {

  private final GreetingService greetingService;

  public MyController() {
    this.greetingService = new GreetingServiceImpl();
  }

  public String sayHello() {
    System.out.println("I am in the controller!");

    return "Hello Everyone!!!";
  }

  public void beforeInit(){
    System.out.println("## - Before Init - Called by Bean Post Processor");
  }

  public void afterInit(){
    System.out.println("## - After init called by Bean Post Processor");
  }

}
