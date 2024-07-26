package com.in28minutes.learn_spring_framework.games;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
