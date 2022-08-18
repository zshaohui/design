package com.zsh.design.interpreter;

public class SentenceNode extends AbstractNode {

	private AbstractNode direction;
	private AbstractNode action;
	private AbstractNode distanc;

	public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distanc) {
		this.direction = direction;
		this.action = action;
		this.distanc = distanc;
	}

	@Override
	public String interpret() {
		return direction.interpret() + action.interpret() + distanc.interpret();
	}

}
