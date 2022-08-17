package com.zsh.design.visitor;

public class Client {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		
		Success success = new Success();
		objectStructure.dislay(success);
		System.out.println("------------");
		
		Fail fail = new Fail();
		objectStructure.dislay(fail);
		System.out.println("------------");
		
		Wait wait = new Wait();
		objectStructure.dislay(wait);
	}

}
