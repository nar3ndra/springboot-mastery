package com.in28minutes.learn_spring_framework.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;
    public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) {
        this.game = game;
    }
    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
