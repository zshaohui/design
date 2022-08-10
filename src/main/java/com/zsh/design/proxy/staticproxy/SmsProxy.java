package com.zsh.design.proxy.staticproxy;

public class SmsProxy implements SmsService {

	private SmsService smsService;

	public SmsProxy(SmsService smsService) {
		this.smsService = smsService;
	}

	@Override
	public String send(String message) {
		// 调用方法之前，我们可以添加自己的操作
		System.out.println("before method send()");
		message = message +"123";
		
		smsService.send(message);
		// 调用方法之后，我们同样可以添加自己的操作
		System.out.println("after method send()");
		return message;
	}

}
