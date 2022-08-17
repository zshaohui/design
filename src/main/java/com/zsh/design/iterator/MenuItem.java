package com.zsh.design.iterator;

/*
 * 菜单
 */
public class MenuItem {
	
	private String name; //食物名字
	private double price;//价格
	
	public MenuItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
