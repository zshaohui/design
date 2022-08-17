package com.zsh.design.visitor;

public abstract class Action {
	
	/*
	 * 得到男性评分
	 */
	public abstract void getManResult(Man man);
	
	/*
	 * 得到女性评分
	 */
	public abstract void getWomanManResult(Woman man);
}
