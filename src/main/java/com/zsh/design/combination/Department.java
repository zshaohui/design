package com.zsh.design.combination;

/*
 * 专业
 */
public class Department extends Component {

	public Department(String name, String des) {
		super(name, des);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

	@Override
	protected void print() {
		System.out.println("名称：" + getName() + "描述：" + getDes());
	}

}
