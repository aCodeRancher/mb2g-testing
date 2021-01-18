package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaHelloWorld1Test {

    JavaHelloWorld jhw ;

    @BeforeEach
    public void setUp(){
        jhw = new JavaHelloWorld();
    }

    @Test
    public void helloTest(){
       String output = jhw.getHello();
       assertTrue(output.equals("Hello World"));
    }
}
