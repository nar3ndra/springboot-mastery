package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {};

record Address(String street, String city, String state, String zip) {};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Narendra";
    }
    @Bean
    public int age(){
        return 25;
    }

    @Bean

    public Person person(){
        return new Person("Narendra", 25);
    }
    @Bean(name="customAddressName")
    @Primary
    public Address address(){
        return new Address("Bakers Street", "London", "London", "06605");
    }


    //Create a Spring Bean using existing Spring managed Beans.
    @Bean(name="personWithBeans")
    public Person personWithBeans(){
        return new Person(name(),age());
    }

    //alternate way
    @Bean
    public Person person3Parameters(String name,int age){
        return new Person(name,age);

    }
}
