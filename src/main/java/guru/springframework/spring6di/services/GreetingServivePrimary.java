package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * created by R. Ammon
 */

@Primary
@Service
public class GreetingServivePrimary implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello from Primary Bean!";
  }
}
