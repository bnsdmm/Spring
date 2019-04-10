package com.atguigu.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArithmeticCalculatorProxy {
    //目标对象
    private ArithmeticCalculator target;

    public ArithmeticCalculatorProxy(ArithmeticCalculator target) {
        this.target = target;
    }

    public Object getProxy() {
        Object proxy;

        ClassLoader loader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        proxy = Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                System.out.println("LoggingProxy==> The method " + methodName + " begin with " + Arrays.asList(args));
                Object result = method.invoke(target, args);
                return result;
            }
        });
        return proxy;
    }
}
