package jdk;

import java.util.HashMap;
import java.util.Map;

public class MapCodeSnippet {

    public static void main(final String[] args) {
        System.out.println(merge(1.4));
        System.out.println(compute(1.5));
    }

    private static Map<String, Double> merge(final double value) {
        final Map<String, Double> map = new HashMap<>();
        map.put("s1", 1.0);
        map.merge("s1", value, (v1, v2) -> (v1 + v2));
        map.merge("s2", value, (v1, v2) -> (v1 + v2));
        return map;
    }

    private static Map<String, Double> compute(final double value) {
        final Map<String, Double> map = new HashMap<>();
        map.put("s1", 1.0);
        // s1 = 1.0 + value
        map.compute("s1", (k, v) -> (v + value));
        // s2 = value + 3
        map.computeIfAbsent("s2", k -> (value + 3));
        // s2 = value + 3 + value
        map.computeIfPresent("s2", (k, v) -> (v + value));
        // This case should use merge() instead
        map.compute("s3", (k, v) -> (v == null ? value : v + value));
        return map;
    }
}
