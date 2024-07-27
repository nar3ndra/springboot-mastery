package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MySQLDataService implements DataService {
    /**
     * @return
     */
    @Override
    public int[] retrieveData() {
        return new int[] {11,12,13,14,15,16,17,18,19};
    }
}
