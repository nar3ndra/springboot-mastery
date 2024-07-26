package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.SuperContra;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        SuperContra marioGame = new SuperContra();
        GameRunner gameRunner  = new GameRunner(marioGame);
        //Object creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner



        gameRunner.run();


    }
}
