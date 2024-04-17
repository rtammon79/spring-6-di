package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

/**
 * created by R. Ammon
 */
@Service
public class GreetingServiceImpl implements GreetingService {


  @Override
  public String sayGreeting() {
    return "Hello Everyone From Base Service!!!";
  }


}
