package com.asu.duck;

import com.asu.duck.fly.FlyWithWings;
import com.asu.duck.quack.Quack;

public class IndianDuck extends Duck {
	
	public IndianDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
	
	@Override
	public void eat() {
		System.out.println("I am busy eating. Do not disturb");
	}
}
