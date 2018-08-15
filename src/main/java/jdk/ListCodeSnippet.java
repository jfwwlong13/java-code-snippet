package jdk;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class ListCodeSnippet {

    public static void main(final String[] args) {
        // Merge 2 lists
        final List<Integer> l1 = ImmutableList.of(1, 2, 3);
        final List<Integer> l2 = ImmutableList.of(4, 5, 6);
        final List<Integer> merged = Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
        System.out.println(merged);

        // Group by
        Map<Integer, List<Integer>> collect = merged.stream().collect(groupingBy(i -> i % 2, toList()));
        System.out.println(collect);

        // sum
        int sum = merged.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
    }
}
