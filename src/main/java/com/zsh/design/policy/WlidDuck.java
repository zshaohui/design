package com.zsh.design.policy;

public class WlidDuck extends Duck{

	public WlidDuck() {
		flyBehavior = new GoodFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("这是野鸭");
	}

}
