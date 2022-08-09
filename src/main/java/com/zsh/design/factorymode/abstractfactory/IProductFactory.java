package com.zsh.design.factorymode.abstractfactory;

public interface IProductFactory {
	// 生产手机
	IphoneProduct iphoneProduct();

	// 生产路由器
	IRouterProduct iRouterProduct();
}
