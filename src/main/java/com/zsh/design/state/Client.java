package com.zsh.design.state;

public class Client {

	public static void main(String[] args) {
		
		RaffleActivity activity = new RaffleActivity(1);
		
		for (int i = 0; i < 30; i++) {
			activity.debuctMoney();
			activity.raffle();
		}
		
	}

}
