package guru.springframework.spring6di.controllers.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * created by R. Ammon
 */
@Controller
public class Myi18NController {

  private GreetingService greetingService;

  public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    return greetingService.sayGreeting();
  }

}
