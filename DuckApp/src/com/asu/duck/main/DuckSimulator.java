package com.asu.duck.main;

import com.asu.duck.Duck;
import com.asu.duck.IndianDuck;
import com.asu.duck.ModelDuck;
import com.asu.duck.ToyDuck;
import com.asu.duck.fly.FlyRocketPower;
import com.asu.duckcall.DuckCall;

public class DuckSimulator {
	
	public static void main(String args[]) {
		Duck desi = new IndianDuck();
		desi.display();
		desi.eat();
		desi.swim();
		desi.performFly();
		desi.performQuack();
		
		Duck angrez = new ToyDuck() {
			@Override
			public void eat() {
				System.out.println("I can't eat. Why don't they understand");
			}
		};
		angrez.eat();
		angrez.performQuack();
		angrez.performFly();
		
		Duck magic = new ModelDuck();
		magic.performFly();
		magic.setFlyBehaviou(new FlyRocketPower());
		magic.performFly();
		
		DuckCall toy = new DuckCall();
		toy.performQuack();	
	}
}
