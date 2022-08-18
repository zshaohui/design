package com.zsh.design.chainofresponsibilities;

public class Client {
	public static void main(String[] args) {
		Dean dean = new Dean("主任");
		Director director = new Director("院长");
		Headmaster headmaster = new Headmaster("校长");
		
		dean.setApprover(director);
		director.setApprover(headmaster);
		
		PurchaseRequest purchaseRequest = new PurchaseRequest(1,10000f,1);
		dean.processRequest(purchaseRequest);
	}
}
