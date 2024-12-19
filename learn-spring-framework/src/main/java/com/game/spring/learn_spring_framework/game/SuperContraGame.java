package com.game.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;


public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("SuperContraGame up");
	}
	public void down() {
		System.out.println("SuperContraGame down");
	}
	public void left() {
		System.out.println("SuperContraGame left");
	}
	public void right() {
		System.out.println("SuperContraGame right");
	}
}
