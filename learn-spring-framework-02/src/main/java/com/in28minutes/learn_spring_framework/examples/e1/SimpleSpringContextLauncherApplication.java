package com.in28minutes.learn_spring_framework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;


@Component
class NormalClass{

}

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE )
class PrototypeClass{

}


@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.examples")
public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {


        }


    };

}



