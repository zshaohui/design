package com.zsh.design.adapter.interfaceadapter;

public class TestInterfaceAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AC220 ac220 = new AC220();
		DC dc  = new Power5VAdapter(ac220);
		System.out.println(dc.output5V());
	}

}
