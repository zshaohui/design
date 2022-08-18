package com.zsh.design.mediator;

public class Client {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();

		// 定义同事类》
		Button addBT = new Button();
		List list = new List();
		Combox cb = new Combox();
		TextBox userNameTB = new TextBox();

		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);

		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;

		addBT.changed();
		System.out.println("-------------------------");
		list.changed();
	}

}
