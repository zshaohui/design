package com.zsh.design.singleton;

public class LazyManThreadNoSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLazyManThreadNoSafe singletonLazyManThreadNoSafe = new SingletonLazyManThreadNoSafe();
		SingletonLazyManThreadNoSafe singletonLazyManThreadNoSafe1 = SingletonLazyManThreadNoSafe.getSingletonLazyManThreadNoSafe();
		SingletonLazyManThreadNoSafe singletonLazyManThreadNoSafe2 = SingletonLazyManThreadNoSafe.getSingletonLazyManThreadNoSafe();
		System.out.println(singletonLazyManThreadNoSafe.hashCode());
		System.out.println(singletonLazyManThreadNoSafe1.hashCode());
		System.out.println(singletonLazyManThreadNoSafe2.hashCode());
	}

}

class SingletonLazyManThreadNoSafe{
	private static SingletonLazyManThreadNoSafe instance;
	
	public static SingletonLazyManThreadNoSafe getSingletonLazyManThreadNoSafe() {
		if (instance == null) {
			instance = new SingletonLazyManThreadNoSafe();
		}
		return instance;
	}
} 
