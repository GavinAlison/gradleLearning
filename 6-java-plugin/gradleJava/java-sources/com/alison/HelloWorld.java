package com.alison;

import com.alison.inter.HelloWordApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloWorld implements HelloWordApi {
          private final static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public String sayHello(){
        logger.info("Saying Hello World.");
        return "Hello World.";
    }
}
