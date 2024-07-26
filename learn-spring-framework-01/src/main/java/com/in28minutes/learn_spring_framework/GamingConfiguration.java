package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.GamingConsole;
import com.in28minutes.learn_spring_framework.games.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        return new Pacman();

    }


    @Bean(name="gameRunner")
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
