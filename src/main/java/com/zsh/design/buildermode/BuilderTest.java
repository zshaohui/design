package com.zsh.design.buildermode;

import com.alibaba.fastjson.JSON;

public class BuilderTest {
	public static void main(String[] args) {
		ComputerBuilder computer = new ComputerBuilder.Builder("因特尔","三星")
				.setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
		System.out.println(JSON.toJSONString(computer));
	}
}
