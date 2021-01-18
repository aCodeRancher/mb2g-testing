package guru.springframework;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

class JavaHelloWorldTest {

    @Test
    void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}