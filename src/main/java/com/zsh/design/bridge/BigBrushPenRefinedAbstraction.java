package com.zsh.design.bridge;

/*
 * 粗毛笔
 */
public class BigBrushPenRefinedAbstraction extends BrushPenAbstraction{

	@Override
	public void operationDraw() {
		System.out.println("Big and "+imp.bepaint()+" drawing!");
	}

}
