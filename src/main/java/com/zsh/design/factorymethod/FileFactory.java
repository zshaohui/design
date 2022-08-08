package com.zsh.design.factorymethod;

public class FileFactory implements LogFactory {

	@Override
	public Log createLog() {
		// TODO Auto-generated method stub
		return new DatabaseLog();
	}

}
