package com.in28minutes.learn_spring_framework.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {
    public SuperContra(){

    }

    /**
     *
     */
    @Override
    public void up() {
        System.out.println("Super contra up");
    }

    /**
     *
     */
    @Override
    public void down() {
    System.out.println("Down");
    }

    /**
     *
     */
    @Override
    public void left() {
    System.out.println("left");
    }

    /**
     *
     */
    @Override
    public void right() {
    System.out.println("right");
    }
}
