package com.in28minutes.learn_spring_framework.games;

public class SuperContra implements GamingConsole {
    public SuperContra(){

    }

    /**
     *
     */
    @Override
    public void up() {
        System.out.println("up");
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
