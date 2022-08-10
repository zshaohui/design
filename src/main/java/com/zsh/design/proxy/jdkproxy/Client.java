package com.zsh.design.proxy.jdkproxy;

public class Client {

	public static void main(String[] args) {
		SmsServiceJdk smsServiceJdk = (SmsServiceJdk)JdkProxyFactory.getProxy(new SmsServiceJdkImpl());
		smsServiceJdk.send("java");
	}

}
