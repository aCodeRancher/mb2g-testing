package guru.springframework;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JavaHelloWorld1Test {

    @Test
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}