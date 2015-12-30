package com.asu.duck;

import com.asu.duck.fly.DoNotFly;
import com.asu.duck.quack.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehaviour = new DoNotFly();
		quackBehaviour = new Quack();
	}
	
	@Override
	public void eat() {
		System.out.println("I am just a modelled duck. Trying to find a place in this world.");
	}
}
