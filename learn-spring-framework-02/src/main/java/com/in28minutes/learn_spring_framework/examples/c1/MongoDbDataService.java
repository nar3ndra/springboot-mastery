package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{
    /**
     * @return
     */
    @Override
    public int[] retrieveData() {
        return new int[] {111,222,333,444,555};
    }
}
