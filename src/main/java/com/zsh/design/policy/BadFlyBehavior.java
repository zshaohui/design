package com.zsh.design.policy;

public class BadFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("飞行技术一般");
	}

}
