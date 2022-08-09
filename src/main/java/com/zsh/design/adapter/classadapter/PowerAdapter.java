package com.zsh.design.adapter.classadapter;

/**
 * 类适配器
 * 适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。
 */
public class PowerAdapter extends AC220 implements DC5 {

	@Override
	public int output5V() {
		int output = output220V();
		return output / 44;
	}

}
