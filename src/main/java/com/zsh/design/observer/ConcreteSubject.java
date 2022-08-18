package com.zsh.design.observer;

public class ConcreteSubject extends Subject{
	
	public void  doSomething() {
		super.notifyObservers();
	}
}
