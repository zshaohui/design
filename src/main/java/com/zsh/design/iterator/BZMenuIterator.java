package com.zsh.design.iterator;

import java.util.Iterator;
import java.util.List;

public class BZMenuIterator implements Iterator {

	List<MenuItem> menuItems;
	int position = 0;

	public BZMenuIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (menuItems != null && menuItems.size() > position) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}
}
