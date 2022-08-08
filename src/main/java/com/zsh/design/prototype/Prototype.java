package com.zsh.design.prototype;

public class Prototype implements Cloneable{
	private String name;
	private Long time;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public Prototype(String name, Long time) {
		this.name = name;
		this.time = time;
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +":" + this.time;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	
	
}
