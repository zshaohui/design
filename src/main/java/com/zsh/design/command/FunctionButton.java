package com.zsh.design.command;

public class FunctionButton {
	private CommandInterface command;

	public void setCommand(CommandInterface command) {
		this.command = command;
	}

	public void click() {
		command.execute();
	}
}
