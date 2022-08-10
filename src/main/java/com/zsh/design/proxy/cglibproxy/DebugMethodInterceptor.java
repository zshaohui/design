package com.zsh.design.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DebugMethodInterceptor implements MethodInterceptor{

	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		//调用方法之前，我们可以添加自己的操作
        System.out.println("before method " + method.getName());
        Object object = method.invoke(o, args);
        System.out.println("after method " + method.getName());
		return object;
	}	

}
