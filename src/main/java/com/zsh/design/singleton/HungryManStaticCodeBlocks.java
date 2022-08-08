package com.zsh.design.singleton;

/**
 * 单例模式,静态代码块
 */
public class HungryManStaticCodeBlocks {

	public static void main(String[] args) {
		SingletonCodeBlocks singleton = new SingletonCodeBlocks();
		SingletonCodeBlocks singleton1 = SingletonCodeBlocks.singletonCodeBlocks();
		SingletonCodeBlocks singleton2 = SingletonCodeBlocks.singletonCodeBlocks();
		System.out.println(singleton.hashCode());
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}

}


class SingletonCodeBlocks{
	
	private static SingletonCodeBlocks instance;
	
	static {
		instance = new SingletonCodeBlocks();
	}
	
	public static  SingletonCodeBlocks singletonCodeBlocks() {
		return instance;
	}
}
