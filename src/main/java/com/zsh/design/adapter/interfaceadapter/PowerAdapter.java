package com.zsh.design.adapter.interfaceadapter;

public abstract class PowerAdapter implements DC {

	public AC220 ac220;

	
	public PowerAdapter(AC220 ac220) {
		this.ac220 = ac220;
	}
	
	
	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int output9V() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int output12V() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int output24V() {
		// TODO Auto-generated method stub
		return 0;
	}

}
