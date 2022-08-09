package com.zsh.design.factorymethod;

public class DatabaseFactory implements LogFactory {

	public Log createLog() {
		// TODO Auto-generated method stub
		return new DatabaseLog();
	}

}
