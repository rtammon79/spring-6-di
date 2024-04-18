package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * created by R. Ammon
 */
@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

  @Autowired
  EnvironmentController environmentController;

  @Test
  void getEnvironment() {
    System.out.println(environmentController.getEnvironment());
  }
}