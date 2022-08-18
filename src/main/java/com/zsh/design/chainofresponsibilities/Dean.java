package com.zsh.design.chainofresponsibilities;

/*
 * 院长
 */
public class Dean extends Approver {

	public Dean(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (5000 <= purchaseRequest.getPrice() && purchaseRequest.getPrice() < 10000) {
			System.out.println(this.name + "---处理的金额是" + purchaseRequest.getPrice());
		}else {
			approver.processRequest(purchaseRequest);
		}
	}

}
