package com.zsh.design.prototype;

/*
 * 原型（Prototype）模式的定义如下：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。例如，Windows 操作系统的安装通常较耗时，如果复制就快了很多。在生活中复制的例子非常多，这里不一一列举了

原型模式的优点：

Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。
原型模式的缺点：

需要为每一个类都配置一个 clone 方法
clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。
原型模式的实现方式

原型类实现接口：Cloneable
重写clone方法
 */

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype prototype1 = new Prototype("zahngsan",System.currentTimeMillis());
		Prototype prototype2 =(Prototype) prototype1.clone();
		prototype2.setTime(System.currentTimeMillis() + 100);
		System.out.println(prototype1.toString());
		System.out.println(prototype2.toString());
	}
}
