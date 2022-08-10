package com.zsh.design.appearance;

public class StockB {
	private int stockCount = 0;

	public void sell(int count) {
		stockCount -= count;
		System.out.println("卖了" + count + "支 B 股票");
	}

	public void buy(int count) {
		stockCount += count;
		System.out.println("买了" + count + "支B 股票");
	}

	public int getStockCount() {
		return stockCount;
	}
}
