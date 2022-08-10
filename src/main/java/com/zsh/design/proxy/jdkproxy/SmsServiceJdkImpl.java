package com.zsh.design.proxy.jdkproxy;

public class SmsServiceJdkImpl implements SmsServiceJdk {

	@Override
	public String send(String message) {
		System.out.println("开始发送短信"+message);
		return message;
	}	

}
