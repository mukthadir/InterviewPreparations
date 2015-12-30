package com.asu.duck.quack;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}
}
