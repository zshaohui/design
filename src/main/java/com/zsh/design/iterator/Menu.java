package com.zsh.design.iterator;

import java.util.Iterator;

/*
 * 聚合接口
 */
public interface Menu {
	Iterator<MenuItem> createIterator();
}
