package com.zsh.design.chainofresponsibilities;

/*
 * 审批抽象类
 */
public abstract class Approver {
	Approver approver; // 下一个处理者
	String name; // 名字

	// 处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
	public abstract void processRequest(PurchaseRequest purchaseRequest);

	public Approver(String name) {
		this.name = name;
	}

	public Approver getApprover() {
		return approver;
	}

	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
