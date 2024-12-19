package com.game.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.game.spring.learn_spring_framework.game.GamingConsole;
import com.game.spring.learn_spring_framework.game.GameRunner;
import com.game.spring.learn_spring_framework.game.MarioGame;
import com.game.spring.learn_spring_framework.game.PacmanGame;
import com.game.spring.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		
		//GamingConsole game = new MarioGame ();
		//GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.run();	
	}
}
