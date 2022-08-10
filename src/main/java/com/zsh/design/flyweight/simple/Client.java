package com.zsh.design.flyweight.simple;

public class Client {

	public static void main(String[] args) {
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight factorya = flyweightFactory.factory(new Character('a'));
		factorya.operation("1");
		Flyweight factoryb = flyweightFactory.factory(new Character('b'));
		factoryb.operation("2");
		Flyweight factoryc = flyweightFactory.factory(new Character('a'));
		factoryc.operation("3");
	}

}
