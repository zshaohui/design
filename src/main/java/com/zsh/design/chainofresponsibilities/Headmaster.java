package com.zsh.design.chainofresponsibilities;

/*
 * 校长
 */
public class Headmaster extends Approver {

	public Headmaster(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (10000 <= purchaseRequest.getPrice()) {
			System.out.println(this.name + "---处理的金额是" + purchaseRequest.getPrice());
		}
	}

}
