package com.zsh.design.visitor;

public class Wait extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("评价待定--男");
	}

	@Override
	public void getWomanManResult(Woman man) {
		System.out.println("评价待定--女");
	}
	
}
