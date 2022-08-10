package com.zsh.design.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight {

	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

	/**
	 * 增加一个新的单纯享元对象到聚集中
	 */
	public void add(Character key, Flyweight fly) {
		files.put(key, fly);
	}

	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		Flyweight fly = null;
		for (Object o : files.keySet()) {
			fly = files.get(o);
			fly.operation(state);
		}
	}

}
