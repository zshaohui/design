package com.zsh.design.simplefactory;

public class MaseratiCar extends Car{

	private String name;
	
	public MaseratiCar(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name+"运行");
	}

}
