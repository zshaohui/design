package com.zsh.design.adapter.objectadapter;

public class TsetObjectAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DC5 dc5 = new PowerAdapter(new Ac220());
		System.out.println(dc5.output5V());
	}

}
