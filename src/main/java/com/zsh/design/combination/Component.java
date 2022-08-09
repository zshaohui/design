package com.zsh.design.combination;

public abstract class Component {
	private String name;
	private String des;

	public Component(String name, String des) {
		this.name = name;
		this.des = des;
	}

	// 抽象的打印方法
	protected abstract void print();

	// 增加
	protected void add(Component component) {
		// 抛出不支持操作的异常
		throw new UnsupportedOperationException();
	}

	// 移除
	protected void remove(Component component) {
		// 抛出不支持操作的异常
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
}
