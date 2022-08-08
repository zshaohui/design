package com.zsh.design.singleton;

/**
 * 懒汉式加载,锁加在同步代码块上
 */
public class LazyManThreadSafeCodeBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLazyManThreadSafeCodeBlocks Singleton = new SingletonLazyManThreadSafeCodeBlocks();
		SingletonLazyManThreadSafeCodeBlocks Singleton1 = SingletonLazyManThreadSafeCodeBlocks.getSingletonLazyManThreadSafeCodeBlocks();
		SingletonLazyManThreadSafeCodeBlocks Singleton2 = SingletonLazyManThreadSafeCodeBlocks.getSingletonLazyManThreadSafeCodeBlocks();
		System.out.println(Singleton.hashCode());
		System.out.println(Singleton1.hashCode());
		System.out.println(Singleton2.hashCode());
	}

}

class SingletonLazyManThreadSafeCodeBlocks{
	private static SingletonLazyManThreadSafeCodeBlocks instance;
	
	public static  SingletonLazyManThreadSafeCodeBlocks getSingletonLazyManThreadSafeCodeBlocks() { 
		if (instance == null) {
			synchronized(SingletonLazyManThreadSafeCodeBlocks.class) {
			instance = new SingletonLazyManThreadSafeCodeBlocks();
			}
		}
		return instance;
	}
} 
