package com.zsh.design.mediator;

public abstract class Component {

	// 抽象组件类
	private Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	// 转发调用
	public void changed() {
		mediator.componentChanged(this);
	}
	

	public abstract void update();
}
