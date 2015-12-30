package com.asu.duck;

import com.asu.duck.fly.DoNotFly;
import com.asu.duck.quack.Squeak;

public abstract class ToyDuck extends Duck {
	
	public ToyDuck() {
		flyBehaviour = new DoNotFly();
		quackBehaviour = new Squeak();
	}
}
