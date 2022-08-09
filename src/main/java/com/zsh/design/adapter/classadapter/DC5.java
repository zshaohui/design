package com.zsh.design.adapter.classadapter;


/*
 * 目标角色(Target)：这就是所期待得到的接口。
 * 注意：由于这里讨论的是类适配器模式，因此目标不可以是类。
 */
public interface DC5  {
	/**
     * 输出5V直流电（期待得到的接口）
     *
     * @return
     */
    int output5V();
}
