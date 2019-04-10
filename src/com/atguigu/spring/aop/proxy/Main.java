package com.atguigu.spring.aop.proxy;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ArithmeticCalculator target = new ArithmeticCalculatorImpl();
        Object obj = new ArithmeticCalculatorProxy(target).getProxy();
        ArithmeticCalculator proxy = (ArithmeticCalculator) obj;
        System.out.println(proxy.getClass().getName());
        int result = proxy.add(1, 2);
        System.out.println("Main Result :" + result);
    }
}
