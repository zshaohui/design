package com.zsh.design.singleton;

/**
 * 单例模式,双重检查
 */
public class LazyManDoubleJudgment {

	public static void main(String[] args) {
		

	}

}

class SingletonLazyManDoubleJudgment{
	
	private static SingletonLazyManDoubleJudgment instance;
	
	public static  SingletonLazyManDoubleJudgment getSingletonLazyManDoubleJudgment(){
	
		if (instance == null) {
			synchronized (SingletonLazyManDoubleJudgment.class) {
				if (instance == null) {
					synchronized (SingletonLazyManDoubleJudgment.class) {
						if (instance == null) {
							instance = new SingletonLazyManDoubleJudgment();
						}
					}
				}
			}
		}
		return instance;
	}
	
}