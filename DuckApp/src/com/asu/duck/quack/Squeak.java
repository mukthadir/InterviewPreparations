package com.asu.duck.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I am squeaking instead of Quacking");
	}
}
