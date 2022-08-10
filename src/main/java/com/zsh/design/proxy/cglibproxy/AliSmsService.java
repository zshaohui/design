package com.zsh.design.proxy.cglibproxy;

public class AliSmsService {
	public String send(String message) {
		System.out.println("send message:" + message);
		return message;
	}
}
