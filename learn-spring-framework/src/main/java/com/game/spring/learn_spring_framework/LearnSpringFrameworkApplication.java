package com.game.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.game.spring.learn_spring_framework.game.GameRunner;
import com.game.spring.learn_spring_framework.game.MarioGame;
import com.game.spring.learn_spring_framework.game.PacmanGame;
import com.game.spring.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		PacmanGame game = new PacmanGame ();
		GameRunner runner = new GameRunner(game);
		runner.run();	
	}
}
