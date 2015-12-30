package com.asu.duck.quack;

public class Mute implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can't quack. I am on mute mode.");
	}
}
