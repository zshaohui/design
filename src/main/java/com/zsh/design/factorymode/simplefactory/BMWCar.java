package com.zsh.design.factorymode.simplefactory;

public class BMWCar extends Car{

	private String name;
	
	public BMWCar(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name+"运行");
	}

}
