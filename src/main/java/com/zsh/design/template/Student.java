package com.zsh.design.template;

public class Student extends AbstractPerson {

	@Override
	protected void dressup() {
		System.out.println("穿校服");
	}

	@Override
	protected void eatBreakfast() {
		System.out.println("吃妈妈做好的早饭");
	}

	@Override
	protected void takeThings() {
		System.out.println("背书包，带上家庭作业和红领巾");
	}

}
