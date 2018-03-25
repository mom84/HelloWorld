package at.refugeescode.HelloWorld;
import at.refugeescode.HelloWorld.model.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {

	private HelloWorld helloWorld;

	public HelloWorldApplicationTests(){
		helloWorld = new HelloWorld();
	}

	@Test
	public void contextLoads() {
		String result = helloWorld.sayHello();
		assertEquals("Hello World", result);

	}

}
