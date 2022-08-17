package com.zsh.design.iterator;

import java.util.Iterator;
import java.util.List;

public class SXMenuIterator implements Iterator {

	MenuItem[] menuItems;
	int position = 0;

	public SXMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (menuItems != null && menuItems.length > position) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems[position];
		position++;
		return menuItem;
	}
}
