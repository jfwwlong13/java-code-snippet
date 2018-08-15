package jdk;

import com.google.common.collect.ImmutableList;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamCodeSnippet {

    public static void main(final String[] args) {
        // flatmap
        final List<List<Integer>> list = ImmutableList.of(
                ImmutableList.of(1, 2, 3),
                ImmutableList.of(4, 5, 6)
        );

        List<Integer> collect = list.stream().flatMap(Collection::stream).map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);

        // join a list
        final List<String> strings = ImmutableList.of("jiong", "xiong", "is", "a", "bear");
        String result = String.join(" ", strings);
        System.out.println(result);
        result = strings.stream().collect(joining(" "));
        System.out.println(result);
    }
}
