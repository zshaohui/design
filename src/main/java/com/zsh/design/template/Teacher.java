package com.zsh.design.template;

public class Teacher extends AbstractPerson {

	@Override
	protected void dressup() {
		System.out.println("穿工作服");
	}

	@Override
	protected void eatBreakfast() {
		System.out.println("做早饭，照顾孩子吃早饭");
	}

	@Override
	protected void takeThings() {
		System.out.println("带上昨晚准备的考卷");
	}

}
