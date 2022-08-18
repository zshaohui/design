package com.zsh.design.observer;

public class Client {
	public static void main(String[] args) {
		//创建一个观望者
		ObServer concreteObserver = new ConcreteObserver();
		//创建一个被观望者
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		concreteSubject.addObserver(concreteObserver);
		//开始通知
		concreteSubject.doSomething();
	}
}
