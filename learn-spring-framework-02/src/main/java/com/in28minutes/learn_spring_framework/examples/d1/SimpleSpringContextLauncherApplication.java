package com.in28minutes.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.concurrent.Callable;


@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    ClassA classA;


    public ClassB(ClassA classA){
        System.out.println("ClassB initializing lazily");
        this.classA = classA;
    }
}


@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.examples")
public class SimpleSpringContextLauncherApplication {




    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
        context.getBean(ClassB.class);

        }


        };




}



