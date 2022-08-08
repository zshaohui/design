package com.zsh.design.singleton;

/**
 * 懒汉式加载,锁加在方法上
 */
public class LazyManThreadSafeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLazyManThreadSafeMethod singletonLazyManThreadNoSafe = new SingletonLazyManThreadSafeMethod();
		SingletonLazyManThreadSafeMethod singletonLazyManThreadNoSafe1 = SingletonLazyManThreadSafeMethod.getSingletonLazyManThreadNoSafe();
		SingletonLazyManThreadSafeMethod singletonLazyManThreadNoSafe2 = SingletonLazyManThreadSafeMethod.getSingletonLazyManThreadNoSafe();
		System.out.println(singletonLazyManThreadNoSafe.hashCode());
		System.out.println(singletonLazyManThreadNoSafe1.hashCode());
		System.out.println(singletonLazyManThreadNoSafe2.hashCode());
	}

}

class SingletonLazyManThreadSafeMethod{
	private static SingletonLazyManThreadSafeMethod instance;
	
	public static synchronized SingletonLazyManThreadSafeMethod getSingletonLazyManThreadNoSafe() {
		if (instance == null) {
			instance = new SingletonLazyManThreadSafeMethod();
		}
		return instance;
	}
} 
