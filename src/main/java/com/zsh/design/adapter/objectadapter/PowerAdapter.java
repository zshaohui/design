package com.zsh.design.adapter.objectadapter;

public class PowerAdapter implements DC5 {

	private Ac220 ac220;

	public PowerAdapter(Ac220 ac220) {
		this.ac220 = ac220;
	}

	@Override
	public int output5V() {
		int output220v = ac220.output220V();
		return output220v / 44;
	}

}
