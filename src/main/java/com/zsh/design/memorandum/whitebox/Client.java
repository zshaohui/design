package com.zsh.design.memorandum.whitebox;

public class Client {
	public static void main(String[] args) {

		// 发起人
		Originator originator = new Originator();

		// 负责人
		Caretaker caretaker = new Caretaker();

		originator.setState("on");
		caretaker.saveMemento(originator.createMemento());

		// 修改发起人的状态
		originator.setState("Off");

		originator.restoreMemento(caretaker.retrieveMemento());

		System.out.println(originator.getState());
	}
}
