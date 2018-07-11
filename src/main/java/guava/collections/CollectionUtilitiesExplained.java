package guava.collections;

import com.google.common.collect.*;
import com.google.common.primitives.Ints;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://github.com/google/guava/wiki/CollectionUtilitiesExplained
 */
public class CollectionUtilitiesExplained {
    private static int COUNT = 0;

    public static void main(final String[] args) {
        // Iterables
        final Iterable<Double> l1 = ImmutableList.of(1.0, 2.1, 3.3);
        final Iterator<Integer> iterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return COUNT != Integer.MAX_VALUE;
            }

            @Override
            public Integer next() {
                return COUNT++;
            }
        };
        final Iterable<Integer> l2 = () -> iterator;

        final Iterable<Number> concat = Iterables.concat(l1, l2);
        System.out.println(Iterables.get(concat, 500));

        // Lists
        final List<Integer> countUp = Ints.asList(1, 2, 3, 4, 5);
        final List<Integer> countDown = Lists.reverse(countUp); // {5, 4, 3, 2, 1}
        final List<List<Integer>> parts = Lists.partition(countUp, 2); // {{1, 2}, {3, 4}, {5}}

        // Sets
        final Set<Integer> s1 = Sets.newHashSet(1, 2, 3);
        final Set<Integer> s2 = Sets.newHashSet(3, 4, 5, 6);
        System.out.println(Sets.intersection(s1, s2)); // 3
        System.out.println(Sets.difference(s1, s2)); // 1, 2
        System.out.println(Sets.union(s1, s2)); // 1, 2, 3, 4, 5, 6
        System.out.println(Sets.cartesianProduct(s1, s2));

        // Maps
        final List<String> list = ImmutableList.of("weng", "fu", "liu");
        final Map<Integer, String> lenToStrMap = Maps.uniqueIndex(list, String::length);
        System.out.println(lenToStrMap);

        final Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        final Map<String, Integer> right = ImmutableMap.of("b", 2, "c", 4, "d", 5);
        final MapDifference<String, Integer> diff = Maps.difference(left, right);
        diff.entriesInCommon(); // {"b" => 2}
        diff.entriesDiffering(); // {"c" => (3, 4)}
        diff.entriesOnlyOnLeft(); // {"a" => 1}
        diff.entriesOnlyOnRight(); // {"d" => 5}

        // Multimaps
        final Set<String> digits = ImmutableSet.of(
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine");
        final Multimap<Integer, String> index = Multimaps.index(digits, String::length);
        System.out.println(index);

        final ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        multimap.putAll("b", Ints.asList(2, 4, 6));
        multimap.putAll("a", Ints.asList(4, 2, 1));
        multimap.putAll("c", Ints.asList(2, 5, 3));

        final TreeMultimap<Integer, String> inverse = Multimaps.invertFrom(multimap, TreeMultimap.create());
        // note that we choose the implementation, so if we use a TreeMultimap, we get results in order
        /*
         * inverse maps:
         *  1 => {"a"}
         *  2 => {"a", "b", "c"}
         *  3 => {"c"}
         *  4 => {"a", "b"}
         *  5 => {"c"}
         *  6 => {"b"}
         */
        System.out.println(inverse);

        Map<String, Integer> map = ImmutableMap.of("a", 1, "b", 1, "c", 2);
        SetMultimap<String, Integer> forMap = Multimaps.forMap(map);
        // multimap maps ["a" => {1}, "b" => {1}, "c" => {2}]
        Multimap<Integer, String> inversedForMap = Multimaps.invertFrom(forMap, HashMultimap.<Integer, String> create());
        // inverse maps [1 => {"a", "b"}, 2 => {"c"}]
        System.out.println(inversedForMap);

        // Value change in ImmutableList
        Person person = new Person();
        final List<Person> people = ImmutableList.of(person);
        person.age = 2;
        System.out.println(people);
    }

    static class Person {
        int age = 1;

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    '}';
        }
    }
}
