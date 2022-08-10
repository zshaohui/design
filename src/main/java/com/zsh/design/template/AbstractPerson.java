package com.zsh.design.template;

/*
 * 行为骨架
 */
public abstract class AbstractPerson {
	
	public final void prepareGotoSchool() {
		dressup();
		eatBreakfast();
		takeThings();
	}
	
	//起床
	protected abstract void dressup();
	//吃早饭
	protected abstract void eatBreakfast();
	//收拾东西
	protected abstract void takeThings();
}
