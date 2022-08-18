package com.zsh.design.observer;

/*
 * 具体观察者
 */
public class ConcreteObserver implements ObServer {

	@Override
	public void update() {
		System.out.println("接收到消息,并进行处理");
	}

}
