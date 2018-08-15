package design.creational.singleton;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private String name = "xiong";

    private SerializableSingleton() {
        if (HelperHolder.INSTANCE != null) {
            throw new InstantiationError("Not allowed");
        }
    }

    public static SerializableSingleton getInstance() {
        return HelperHolder.INSTANCE;
    }

    private Object readResolve() {
        return getInstance();
    }
    
    private void writeObject(ObjectOutputStream in) throws IOException {
        in.writeUTF(this.name);
    }

    private void readObject(ObjectInputStream o) throws IOException {
        String s = o.readUTF();
        this.name = s + "_bb";
    }

    private static class HelperHolder {
        private static final SerializableSingleton INSTANCE = new SerializableSingleton();
    }
}
