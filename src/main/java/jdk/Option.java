package jdk;

import java.util.Optional;

public class Option {
    public static void main(final String[] args) {
        Optional<String> s = Optional.of("sdf");
        String s1 = s.map(String::toUpperCase).orElseGet(() -> {
            String q = "default";
            return q.toLowerCase();
        });

        System.out.println(s1);
    }
}
