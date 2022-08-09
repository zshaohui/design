package com.zsh.design.decorators;

/*
 * 需要构建的角色
 */
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("构造者原始类");
	}

}
