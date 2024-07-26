package com.in28minutes.learn_spring_framework.games;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.games")
public class GamingAppLauncherApplication {




    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

            //System.out.println(context.getBean("game"));
            context.getBean( GameRunner.class).run();

        }


    }
}
