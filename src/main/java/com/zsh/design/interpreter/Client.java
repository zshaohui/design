package com.zsh.design.interpreter;

public class Client {

	public static void main(String[] args) {
		String instruction = "down run 10 and left move 20";
		InstructionHandler iHandler = new InstructionHandler();
		iHandler.Handle(instruction);
		String outString;
		outString = iHandler.output();
		System.out.println(outString);
	}

}
