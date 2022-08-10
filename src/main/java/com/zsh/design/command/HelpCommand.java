package com.zsh.design.command;

public class HelpCommand implements CommandInterface {
	
	public DisplayHelpClass hcObj = new DisplayHelpClass();
	
	@Override
	public void execute() {
		hcObj.display();
	}

}
