package com.zsh.design.factorymethod;

public class DatabaseFactory implements LogFactory {

	@Override
	public Log createLog() {
		// TODO Auto-generated method stub
		return new DatabaseLog();
	}

}
