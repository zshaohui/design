package com.zsh.design.bridge;

public class TestBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ImplementorColor reImplementorColor = new OncreteImplementorRed();
		 BrushPenAbstraction brushPenAbstraction = new BigBrushPenRefinedAbstraction();
		
		 brushPenAbstraction.setImplementor(reImplementorColor);
		 brushPenAbstraction.operationDraw();
	}

}
