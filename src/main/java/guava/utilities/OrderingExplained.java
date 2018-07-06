package guava.utilities;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import javax.annotation.Nullable;

/**
 * https://github.com/google/guava/wiki/OrderingExplained
 */
public class OrderingExplained {

    public static void main(final String[] args) {
        final Ordering<String> byLengthOrdering = new Ordering<String>() {
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };

        System.out.println(byLengthOrdering.isOrdered(ImmutableList.of("a", "ac", "b")));
        System.out.println(byLengthOrdering.isOrdered(ImmutableList.of("a", "b", "b")));
        System.out.println(byLengthOrdering.reverse().isOrdered(ImmutableList.of("aa", "b", "b")));

        final Ordering<Foo> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Foo, String>() {
            public String apply(Foo foo) {
                return foo.sortedBy;
            }
        });

        System.out.println(ordering.isOrdered(ImmutableList.of(new Foo("sdf", 1), new Foo(null, 1))));
        System.out.println(ordering.isOrdered(ImmutableList.of(new Foo(null, 1), new Foo("a", 1))));

        System.out.println(Ordering.natural().greatestOf(ImmutableList.of(1, 10, 2, 8, 5), 3));
        System.out.println(Ordering.natural().reverse().greatestOf(ImmutableList.of(1, 10, 2, 8, 5), 3));
        System.out.println(Ordering.natural().reverse().min(ImmutableList.of(1, 10, 2, 8, 5)));
    }

    static class Foo {
        @Nullable
        String sortedBy;
        int notSortedBy;

        public Foo(String sortedBy, int notSortedBy) {
            this.sortedBy = sortedBy;
            this.notSortedBy = notSortedBy;
        }
    }
}
