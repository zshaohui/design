package com.zsh.design.visitor;

public class Fail extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("评价失败--男");
	}

	@Override
	public void getWomanManResult(Woman man) {
		System.out.println("评价失败--女");
	}
	
}
