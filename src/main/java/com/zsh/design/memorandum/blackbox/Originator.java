package com.zsh.design.memorandum.blackbox;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 工厂方法，返还一个新的备忘录对象
	 */
	public MementoIF createMemento() {
		return new Memento(state);
	}

	/**
	 * 发起人恢复到备忘录对象记录的状态
	 */
	public void restoreMemento(MementoIF memento) {
		this.setState(((Memento) memento).getState());
		System.out.println(state);
	}

	private class Memento implements MementoIF {

		private String state;

		/**
		 * 构造方法
		 */
		private Memento(String state) {
			this.state = state;
		}

		private String getState() {
			return state;
		}

		private void setState(String state) {
			this.state = state;
		}
	}
}
