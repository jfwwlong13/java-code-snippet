package design.creational.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(final String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // Eagerly initialization
        final Eager e1 = Eager.getInstance();
        final Eager e2 = Eager.getInstance();
        System.out.println(e1 == e2);

        // Enum
        final EnumSingleton enum1 = EnumSingleton.INSTANCE;
        final EnumSingleton enum2 = EnumSingleton.INSTANCE;
        System.out.println(enum1 == enum2);

        // Double check
        final DoubleCheck d1 = DoubleCheck.getInstance();
        final DoubleCheck d2 = DoubleCheck.getInstance();
        System.out.println(d1 == d2);

        // Initialization on demand holder
        final InitializationOnDemandHolder i1 = InitializationOnDemandHolder.getInstance();
        final InitializationOnDemandHolder i2 = InitializationOnDemandHolder.getInstance();
        System.out.println(i1 == i2);

        // Serialization
        final SerializableSingleton singleton = SerializableSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(singleton);
        out.close();

        //deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializableSingleton deserialized = (SerializableSingleton) in.readObject();
        in.close();

        System.out.println(singleton == deserialized);
    }
}
