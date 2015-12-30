package com.asu.duck.fly;

public class DoNotFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly because I am a toy duck.");
	}
}
