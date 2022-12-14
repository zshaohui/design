package com.zsh.design.factorymode.abstractfactory;

/**
 * 抽象工厂（AbstractFactory）模式的定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。

使用抽象工厂模式一般要满足以下条件：

可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
当需要产品族时，抽象工厂可以保证客户端始终只使用同一个产品的产品组。
抽象工厂增强了程序的可扩展性，当增加一个新的产品族时，不需要修改原代码，满足开闭原则。
其缺点是：当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。增加了系统的抽象性和理解难度

抽象工厂模式同工厂方法模式一样，也是由 抽象工厂、具体工厂、抽象产品和具体产品 4 个要素构成，但抽象工厂中方法个数不同，抽象产品的个数也不同。现在我会举例给大家进行分析。

抽象工厂模式的主要角色如下：

抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。

具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。

抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。

具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。
 * 
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProductFactory  XiaomiFactory =	new XiaomiFactory();
		XiaomiFactory.iphoneProduct().start();
		XiaomiFactory.iRouterProduct().setting();
	}

}
