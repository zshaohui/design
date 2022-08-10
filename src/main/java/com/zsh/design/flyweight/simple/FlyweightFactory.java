package com.zsh.design.flyweight.simple;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<Character, Flyweight> files = new HashMap<>();

	public Flyweight factory(Character status) {
		Flyweight flyweight = files.get(status);
		if (flyweight == null) {
			flyweight = new ConcreteFlyweight(status);
			files.put(status, flyweight);
		}
		return flyweight;
	}
}
