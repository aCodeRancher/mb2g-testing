package guru.springframework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    JavaHelloWorld jhw;

    @Before
    public void setUp(){
         jhw = new JavaHelloWorld();
    }

    @Test
    public void getHello() {
        String output = jhw.getHello();
        assertTrue(output.equals("Hello World"));
    }
}