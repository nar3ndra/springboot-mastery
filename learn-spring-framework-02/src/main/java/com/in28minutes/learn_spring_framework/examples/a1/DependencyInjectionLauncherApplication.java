package com.in28minutes.learn_spring_framework.examples.a1;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.examples.a1")
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));

        }


    }
}


@Component
class YourBusinessClass{
//
//   //As soon as you put Autowired on a field. Spring does field injection. Below is the example for field Injection.
//    @Autowired
//    Dependency1 dependency1;
//    @Autowired
//    Dependency2 dependency2;
    //Setter Injection
//    Dependency1 dependency1;
//    Dependency2 dependency2;
//
//    @Autowired
//    public void SetDependency1(Dependency1 dependency1){
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void SetDependency2(Dependency2 dependency2){
//        this.dependency2 = dependency2;
//    }
    //Constructor Injection. For constructor injection Autowired annotation is not mandatory.
    //Spring recommends Constructor Injection always
    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "using"+ dependency1 + "and" + dependency2;
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}