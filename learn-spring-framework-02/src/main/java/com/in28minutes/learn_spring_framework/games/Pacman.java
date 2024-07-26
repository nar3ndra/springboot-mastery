package com.in28minutes.learn_spring_framework.games;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole{
    /**
     *
     */
    @Override
    public void up() {
    System.out.println("Pacman up");
    }

    /**
     *
     */
    @Override
    public void down() {
    System.out.println("Pacman down");
    }

    /**
     *
     */
    @Override
    public void left() {
    System.out.println("Pacman left");
    }

    /**
     *
     */
    @Override
    public void right() {
    System.out.println("Pacman right");
    }
}