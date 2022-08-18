package com.zsh.design.mediator;


/*
 * 具体中介者模式
 */
public class ConcreteMediator extends Mediator {

	// 维持对各个同事类的引用
	public Button addButton;
	public List list;
	public TextBox userNameTextBox;
	public Combox cb;

	@Override
	public void componentChanged(Component c) {

		// TODO Auto-generated method stub
		// 单击按钮
		if (c == addButton) {
			System.out.println("---单击增加按钮");
			list.update();
			cb.update();
			userNameTextBox.update();

		}
		// 从列表框选择客户
		else if (c == list) {
			System.out.println("--从列表中选择客户");
			cb.selected();
			userNameTextBox.setText();
		} else if (c == cb) {
			System.out.println("--从组合框中选择用户");
			cb.selected();
			userNameTextBox.setText();
		}
	}

}
