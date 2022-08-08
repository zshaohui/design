package com.zsh.design.singleton;

/**
 * 枚举
 */
public class Enumerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
		SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
		System.out.println(singletonEnum.hashCode());
		System.out.println(singletonEnum1.hashCode());
	}

}
enum SingletonEnum{
	INSTANCE;
	public void say() {
		// TODO Auto-generated method stub
	  System.out.println("ok");
	}
}
