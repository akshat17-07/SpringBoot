package com.game.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.game.spring.learn_spring_framework.game.GameRunner;
import com.game.spring.learn_spring_framework.game.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame ();
		GameRunner runner = new GameRunner(game);
		runner.run();	
	}
}
