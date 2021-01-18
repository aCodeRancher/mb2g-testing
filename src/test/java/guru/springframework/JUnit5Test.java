package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by jt on 2018-12-12.
 */
public class JUnit5Test {

    JavaHelloWorld jhw;
    @BeforeEach
    public void setUp(){
        jhw = new JavaHelloWorld();
    }
    @Test
    void exampleTest() {
        String output = jhw.getHello();
        assertTrue(output.equals("Hello World"));
    }
}
