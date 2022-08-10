package com.zsh.design.appearance;

public class FundFacade {
	StockA a = null;
	StockB b = null;
	StockC c = null;

	public FundFacade() {
		a = new StockA();
		b = new StockB();
		c = new StockC();
	}

	public void buyAll(int count) {
		a.buy(count);
		b.buy(count);
		c.buy(count);
	}

	public void sellAll(int count) {
		a.sell(count);
		b.sell(count);
		c.sell(count);
	}
}
