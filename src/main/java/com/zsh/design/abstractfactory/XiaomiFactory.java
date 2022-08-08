package com.zsh.design.abstractfactory;

public class XiaomiFactory implements IProductFactory {

	@Override
	public IphoneProduct iphoneProduct() {
		// TODO Auto-generated method stub
		return new XiaomiPhone();
	}

	@Override
	public IRouterProduct iRouterProduct() {
		// TODO Auto-generated method stub
		return new XiaomiRouter();
	}

}
