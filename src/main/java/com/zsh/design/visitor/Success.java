package com.zsh.design.visitor;

public class Success extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("评价成功--男");
	}

	@Override
	public void getWomanManResult(Woman man) {
		System.out.println("评价成功--女");
	}
	
}
