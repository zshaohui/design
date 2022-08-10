package com.zsh.design.command;

public class Client {
	public static void main(String[] args) {
		//调用者
        FunctionButton functionButton = new FunctionButton();
        
        //退出
        CommandInterface exit = new ExitCommand();
        functionButton.setCommand(exit);
        functionButton.click();
       
        //帮助
        CommandInterface help = new HelpCommand();
        functionButton.setCommand(help);
        functionButton.click();
	}
}
