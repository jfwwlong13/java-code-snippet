package jdk.proxy;

import java.lang.reflect.Proxy;

public class App {

    public static void main(final String[] args) {
        IHelloWorld hw = new HelloWorld();
        LoggerHandler handler = new LoggerHandler(hw);
        IHelloWorld proxy = (IHelloWorld) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                hw.getClass().getInterfaces(), handler);
        proxy.sayHello("xinxing");
        proxy.sayHelloToPython();
    }
}
