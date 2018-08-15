package guava;

import com.google.common.collect.Lists;
import com.google.common.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ReflectionExplained {

    public static void main(final String[] args) {
        ArrayList<String> stringList = Lists.newArrayList();
        ArrayList<Integer> intList = Lists.newArrayList();
        System.out.println(stringList.getClass().isAssignableFrom(intList.getClass()));
        System.out.println(stringList.getClass());
        Class clz = Integer.class;
        System.out.println(clz);
        TypeToken<String> token = TypeToken.of(String.class);
        System.out.println(token.getType());
        TypeToken<List<Double>> typeToken = new TypeToken<List<Double>>() {};
        Type type = typeToken.getType();
        System.out.println(type);
    }
}
