package com.zsh.design.interpreter;

public class AndNode extends AbstractNode {

	private AbstractNode left; // 左表达式
	private AbstractNode right; // 右表达式

	public AndNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String interpret() {
		return left.interpret() + "再" + right.interpret();
	}
}
