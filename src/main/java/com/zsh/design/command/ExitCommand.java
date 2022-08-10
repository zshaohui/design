package com.zsh.design.command;

public class ExitCommand implements CommandInterface {
	
	public SystemExitClass setObj = new SystemExitClass();
	
	@Override
	public void execute() {
		setObj.exit();
	}

}
