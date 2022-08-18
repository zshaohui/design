package com.zsh.design.mediator;

public class Combox extends Component{
	 
	@Override
	public void update() {
		System.out.println("组合框增加一项：杨过");
	}
	public void selected() {
		System.out.println("组合框选中项：小龙女");
	}
}
