package com.zsh.design.mediator;

public class List extends Component {

	@Override
	public void update() {
		System.out.println("列表框增加一项：杨过");
	}

	public void selected() {
		System.out.println("列表框选中项：小龙女");
	}
}
