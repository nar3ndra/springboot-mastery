package com.in28minutes.learn_spring_framework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency=someDependency;
        System.out.println("All Dependencies are Ready");
    }

    @PostConstruct
            public void postConstruct(){
        someDependency.run();

    }

    @PreDestroy
            public void preDestroy(){
        someDependency.finish();

    }
}

@Component
class SomeDependency{
    public void run(){
        System.out.println("SomeDependency is ready");
    }
    public void finish(){
        System.out.println("SomeDependency is finished");
    }

}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {



    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {

        context.getBean(SomeClass.class);
        }


    }
}
