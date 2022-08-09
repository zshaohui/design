package com.zsh.design.simplefactory;

/*
 * 汽车工厂类
 */
public class CarFactory {

	public static Car createCar(String brand) {
		Car car = null;
		switch (brand) {
		case "maserati":
			car = new MaseratiCar(brand);
			break;
		case "bmw":
			car = new BMWCar(brand);
			break;
		}
		return car;
	}
}
