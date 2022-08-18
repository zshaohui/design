package com.zsh.design.policy;

public class PekingDuck extends Duck{

	public PekingDuck() {
		flyBehavior = new NoFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("玩具鸭");
	}

}
