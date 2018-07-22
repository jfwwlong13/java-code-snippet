package jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerHandler implements InvocationHandler {
    private final Object object;

    public LoggerHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before executing");
        Object result = method.invoke(object, args);
        System.out.println("After executing");
        if (method.getName().endsWith("Python")) {
            System.out.println("After executing Python");
        }

        return result;
    }
}
