package com.zsh.design.factorymode.factorymethod;

public class FileFactory implements LogFactory {

	public Log createLog() {
		// TODO Auto-generated method stub
		return new DatabaseLog();
	}

}
