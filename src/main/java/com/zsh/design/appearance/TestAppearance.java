package com.zsh.design.appearance;

public class TestAppearance {

	public static void main(String[] args) {
		int count = 100;
		// TODO Auto-generated method stub
		FundFacade facade = new FundFacade();
		facade.buyAll(count);
		facade.sellAll(count);
	}

}
