package at.refugeescode.HelloWorld;
import at.refugeescode.HelloWorld.model.HelloWorld;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		HelloWorld helloWorld = new HelloWorld();
//		System.out.println(helloWorld.sayHello() + " New Way");
	}
}
