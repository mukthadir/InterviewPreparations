package com.asu.duck;

import com.asu.duck.fly.FlyBehaviour;
import com.asu.duck.quack.QuackBehavior;

public abstract class Duck {
	protected QuackBehavior quackBehaviour;
	protected FlyBehaviour flyBehaviour;
	
	public Duck() {
	}
	
	public void display() {
		System.out.println("We will implement this feature at a later date");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public abstract void eat();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void setFlyBehaviou(FlyBehaviour fly) {
		flyBehaviour = fly;
	}
	
	public void setQuackBehaviou(QuackBehavior quack) {
		quackBehaviour = quack;
	}
}
