package com.zsh.design.singleton;

/**
 * 单例模式,静态常量
 */
public class HungryManStaticConstant {
	public static void main(String[] args) {
		Singleton singleton = new Singleton();
		Singleton singleton2 = Singleton.getSingleton();
		Singleton singleton3 = Singleton.getSingleton();
		System.out.println(singleton == singleton2);
		System.out.println(singleton == singleton3);
		System.out.println(singleton2 == singleton3);
	}
}


class Singleton{
	//1.构造器私有化,外部可以创建
	public Singleton() {
		
	}
	//2.创建一个静态常量
	private final static  Singleton intance = new Singleton();
	//3.暴露出一个方法
	public static Singleton getSingleton() {
		return intance;
	}
	
	
}