package com.zsh.design.visitor;

public abstract class Person {
	//访问者可以访问
	public abstract void accept(Action action);
}
