package jdk.proxy;

public class HelloWorld implements IHelloWorld {
    @Override
    public void sayHello(final String name) {
        System.out.println("Hello World: " + name);
    }

    @Override
    public void sayHelloToPython() {
        System.out.println("Hello Python");
    }
}
