package com.zsh.design.policy;

public class TopDuck extends Duck{

	public TopDuck() {
		flyBehavior = new BadFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("北京鸭");
	}

}
