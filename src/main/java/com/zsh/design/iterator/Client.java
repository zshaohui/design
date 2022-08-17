package com.zsh.design.iterator;

public class Client {

	public static void main(String[] args) {
		BZMenu bzMenu = new BZMenu();
		SXMenu sxMenu = new SXMenu();
		Waitress waitress = new Waitress(bzMenu, sxMenu);
		waitress.printMenu();
	}

}
