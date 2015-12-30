package com.asu.duckcall;

import com.asu.duck.quack.Quack;
import com.asu.duck.quack.QuackBehavior;

public class DuckCall {
	
	public void performQuack() {
		Quack quackBehaviour = new Quack();
		quackBehaviour.quack();
	}
}
