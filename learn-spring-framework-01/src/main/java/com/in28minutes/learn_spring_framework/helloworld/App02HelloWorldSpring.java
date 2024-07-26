package com.in28minutes.learn_spring_framework.helloworld;

import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

//Retrieving Beans managed by spring
//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
//        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean("customAddressName"));
//
//        //use can use the name or Type of the Bean
//        System.out.println(context.getBean(Address.class));
//
//        System.out.println(context.getBean("personWithBeans"));
//
//        System.out.println(context.getBean("person3Parameters"));
//

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
