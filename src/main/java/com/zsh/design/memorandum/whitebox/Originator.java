package com.zsh.design.memorandum.whitebox;

/*
 * 发起人角色类
 */
public class Originator {

	private String state;

	/**
	 * 工厂模式,获取到备忘录对象
	 * 
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 将发起人恢复到备忘录对象所记载的状态
	 */
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态：" + this.state);
	}
}
