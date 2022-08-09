package com.zsh.design.decorators;

/*
 * 抽象装饰角色
 */
public class Decorator implements Component {

	private Component component;
	
	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		component.operation();
	}

}
