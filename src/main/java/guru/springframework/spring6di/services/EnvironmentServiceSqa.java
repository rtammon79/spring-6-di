package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * created by R. Ammon
 */
@Profile("sqa")
@Service
public class EnvironmentServiceSqa implements EnvironmentService {

  @Override
  public String getEnv() {
    return "sqa";
  }
}
