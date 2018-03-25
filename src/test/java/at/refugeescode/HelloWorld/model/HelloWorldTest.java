package at.refugeescode.HelloWorld.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {


    private HelloWorld helloWorld = new HelloWorld();

    @Test
    void sayHello() {
        String result = helloWorld.sayHello();
        assertEquals("Hello World", result);
    }
}