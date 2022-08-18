package com.zsh.design.memorandum.blackbox;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("on");
		
		Caretaker caretaker = new Caretaker();
		caretaker.saveMemento(originator.createMemento());
		
		originator.setState("off");
		originator.restoreMemento(caretaker.retrieveMemento());
	}
}
