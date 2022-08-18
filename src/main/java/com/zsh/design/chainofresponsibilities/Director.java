package com.zsh.design.chainofresponsibilities;

/*
 * 主任
 */
public class Director extends Approver{
	
	public Director(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() < 5000) {
			System.out.println(this.name+"---处理的金额是"+purchaseRequest.getPrice());
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
	
}
