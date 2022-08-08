package com.zsh.design.singleton;

/**
 * 静态内部
 */
public class StaticInternal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SingletonStaticInternalClass{
	
	private static class StaticInternalClass{
		private static SingletonStaticInternalClass singleton = new SingletonStaticInternalClass();
	}
	
	public SingletonStaticInternalClass singletonStaticInternalClass() {
		return StaticInternalClass.singleton;
	}
} 