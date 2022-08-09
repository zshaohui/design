package com.zsh.design.factorymethod;

/*
 工厂方法模式又称为工厂模式,在工厂方法模式中,工厂父类负责定义创建产品对象的公共接口,而工厂子类则负责生成具体的产品对象,
 这样做的目的是将产品类的实例化操作延迟到工厂子类中完成,即通过工厂子类来确定究竟应该实例化哪个具体产品
 
 四个角色
Product(抽象产品)
定义产品的接口,是工厂方法模式所创建对象的超类型,即产品对象的共同父类或接口

ConcreteProduct(具体产品)
实现了抽象产品接口,某种类型的产品由专门的具体工厂创建

Factory(抽象工厂)
声明了工厂方法,用于返回一个产品,它是工厂方法模式的核心

ConcreteFactory(具体工厂)
抽象工厂的子类,实现了抽象工厂中定义的工厂方法,并可由客户调用,返回一个具体产品类的实例

优点:
增加新的产品类无需修改现有系统逻辑
系统具有良好的灵活性和可拓展性

缺点:
增加新产品的同时需要增加新的工厂,导致系统类的个数成对增加
在一定程度上增强了系统的复杂性

适用场景:
将创建对象的任务委托给多个工厂子类中的某一个,客户端在使用时可以无需关心是哪一个工厂子类创建产品子类,需要时在动态指定
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		//LogFactory logFactory = new FileFactory(); 
		LogFactory logFactory1 = new DatabaseFactory(); 
		//Log log = logFactory.createLog();
		Log log1 = logFactory1.createLog();
		//log.writeLog();
		log1.writeLog();
	}
}
