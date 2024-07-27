package com.in28minutes.learn_spring_framework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Named
class BusinessService{
    private DataService dataService;


    public DataService getDataService() {
        return dataService;

    }

    @Inject
    public void SetDataService(DataService dataService) {
        this.dataService = dataService;
    }
}


@Named
class DataService{

}




@Configuration
@ComponentScan
public class CDIContextLauncherApplication {




    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());

        }


    }
}
