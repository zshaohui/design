package com.zsh.design.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * 被观察者
 */
public class Subject {
	// 定义一个被观察者数组
	private List<ObServer> obsList = new ArrayList<>();

	// 增加一个观察者
	public void addObserver(ObServer obServer) {
		obsList.add(obServer);
	}

	// 删除一个观察者
	public void delObserver(ObServer obServer) {
		obsList.remove(obServer);
	}

	// 通知所有观察者
	public void notifyObservers() {
		for (ObServer obServer : obsList) {
			obServer.update();
		}
	}

}
