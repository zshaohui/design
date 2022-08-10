package com.zsh.design.proxy.cglibproxy;

public class Client {
	public static void main(String[] args) {
		AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
		aliSmsService.send("cglib");
	}
}
