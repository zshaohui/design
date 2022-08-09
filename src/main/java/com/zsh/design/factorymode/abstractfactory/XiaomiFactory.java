package com.zsh.design.factorymode.abstractfactory;

public class XiaomiFactory implements IProductFactory {

	public IphoneProduct iphoneProduct() {
		// TODO Auto-generated method stub
		return new XiaomiPhone();
	}

	public IRouterProduct iRouterProduct() {
		// TODO Auto-generated method stub
		return new XiaomiRouter();
	}

}
