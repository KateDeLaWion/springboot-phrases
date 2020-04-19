package com.Spring.SpringBootPhrases;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myMainApp {


    public static void main(String[] args) {

        // Run this main function to the class HelloWorld
        // Dependency injection example
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("data.xml");

        RobotPhrases obj = (RobotPhrases) context.getBean("robotphrases");
        obj.getMessage();
        context.registerShutdownHook();

    }


}
