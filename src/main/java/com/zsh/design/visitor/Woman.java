package com.zsh.design.visitor;

public class Woman extends Person{

	@Override
	public void accept(Action action) {
		action.getWomanManResult(this);
	}
 
}
