package at.refugeescode.HelloWorld.configruation;

import at.refugeescode.HelloWorld.model.HelloWorld;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {


    @Bean
    ApplicationRunner applicationRunner(HelloWorld helloWorld) {
      return args -> {
          System.out.println(helloWorld.sayHello());
      };
    }
}
