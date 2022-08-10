package com.zsh.design.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		SmsProxy smsProxy = new SmsProxy(new SmsServiceImpl());
		smsProxy.send("java");
	}

}
