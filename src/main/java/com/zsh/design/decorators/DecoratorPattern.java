package com.zsh.design.decorators;

public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component = new ConcreteComponent();
		component.operation();
		
		
		Component component1 = new ConcreteDecorator(component);
		component1.operation();
	}

}
