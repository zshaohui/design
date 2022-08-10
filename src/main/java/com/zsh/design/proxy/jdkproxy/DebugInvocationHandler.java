package com.zsh.design.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DebugInvocationHandler implements InvocationHandler {

	/*
	 * 目标代理类
	 */
	private Object target;

	/*
	 * 创建构造方法
	 */
	public DebugInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//调用方法之前，我们可以添加自己的操作
        System.out.println("before method " + method.getName());

        Object result = method.invoke(target, args);
        
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method " + method.getName());
		
		return result;
	}

}
