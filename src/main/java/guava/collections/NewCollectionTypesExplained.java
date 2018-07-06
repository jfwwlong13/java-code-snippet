package guava.collections;

import com.google.common.collect.*;

import java.util.Set;

/**
 * https://github.com/google/guava/wiki/NewCollectionTypesExplained
 */
public class NewCollectionTypesExplained {

    public static void main(final String[] args) {
        //Note that Multiset<E> is not a Map<E, Integer>, though that might be part of a Multiset implementation.
        final Multiset<Integer> set = HashMultiset.create();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set.count(1));

        final SortedMultiset<Integer> sortedMultiset = TreeMultiset.create();
        sortedMultiset.add(1);
        sortedMultiset.add(3);
        sortedMultiset.add(1);
        System.out.println(sortedMultiset.subMultiset(1, BoundType.OPEN, 3, BoundType.CLOSED));

        // A Multimap<K, V> is not a Map<K, Collection<V>>, though such a map might be used in a Multimap implementation.
        final ListMultimap<Integer, String> listMultimap = MultimapBuilder.hashKeys().arrayListValues().build();
        listMultimap.put(1, "1sdf");
        listMultimap.put(3, "3sdf");
        listMultimap.put(1, "2sdf");
        listMultimap.get(3).add("4sdf");
        listMultimap.put(null, "I'm null");
        System.out.println(listMultimap);
        System.out.println(listMultimap.get(null));

        //BiMap
        final BiMap<Integer, String> biMap = HashBiMap.create();
        biMap.put(1, "asd");
        biMap.put(2, "asdf");
        System.out.println(biMap);
        System.out.println(biMap.inverse());

        //Table(row, column, value)
        final Table<String, String, Integer> table = HashBasedTable.create();
        table.put("jianfu", "weng", 28);
        table.put("jianfu", "xiong", 29);
        table.put("xinxing", "liu", 27);
        System.out.println(table);

        //Similar with Map<Class, Object>
        final ClassToInstanceMap<Number> classToInstanceMap = ImmutableClassToInstanceMap.<Number>builder()
                .put(Integer.class, 1)
                .put(int.class, 2)
                .put(Double.class, 3.3)
                .build();
        System.out.println(classToInstanceMap);
        System.out.println(classToInstanceMap.getInstance(Integer.class));
        System.out.println(classToInstanceMap.getInstance(int.class));

        final RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(1, 3));
        rangeSet.add(Range.openClosed(4, 5));
        rangeSet.add(Range.closed(3, 4));
        System.out.println(rangeSet);

        final RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        rangeMap.put(Range.closed(1, 2), "asdf33");
        rangeMap.put(Range.closed(1, 3), "asdf13");
        rangeMap.put(Range.closed(2, 3), "asdf23");
        System.out.println(rangeMap);
    }
}
