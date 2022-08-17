package com.zsh.design.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
	private List<Person> persons = new LinkedList<>();
	
	/*
	 * 添加
	 */
	public void attach(Person person) {
		persons.add(person);
	}
	
	/*
	 * 移除
	 */
	public void detach(Person person) {
		persons.remove(person);
	}
	
	public void dislay(Action action) {
		for (Person person : persons) {
			person.accept(action);
		}
	}
}
