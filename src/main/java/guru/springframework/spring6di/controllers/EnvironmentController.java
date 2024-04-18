package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.stereotype.Controller;

/**
 * created by R. Ammon
 */
@Controller
public class EnvironmentController {

  private final EnvironmentService environmentService;

  public EnvironmentController(EnvironmentService environmentService) {
    this.environmentService = environmentService;
  }

  public String getEnvironment() {
    return "you are in the " + environmentService.getEnv() + " environment!";
  }

}
