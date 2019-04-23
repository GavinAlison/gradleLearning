package com.alison;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/***
 * @Author Alison
 * @Date 2019/4/23
 **/

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }
}
