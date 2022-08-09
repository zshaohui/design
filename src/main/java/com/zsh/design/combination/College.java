package com.zsh.design.combination;

import java.util.ArrayList;
import java.util.List;

/*
 * 学院
 */
public class College extends Component {
	// List存放的是专业的信息
	List<Component> components = new ArrayList<>();

	public College(String name, String des) {
		super(name, des);
	}

	// 实际业务中，University和College重写的add方法和remove方法可能不相同
	@Override
	protected void add(Component component) {
		components.add(component);
	}

	@Override
	protected void remove(Component component) {
		components.remove(component);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

	// 打印College包含的专业的名字
	@Override
	protected void print() {
		System.out.println("===============名称：" + getName() + "描述：" + getDes() + "===============");
		for (Component coms : components) {
			coms.print();
		}
	}
}
