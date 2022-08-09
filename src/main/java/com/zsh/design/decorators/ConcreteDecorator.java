package com.zsh.design.decorators;

/*
 * 具体装饰角色
 */
public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		//super.operation();
		addedFunction();
	}

	public void addedFunction() {
		System.out.println("为具体构件角色增加额外的功能addedFunction()");
	}

}
