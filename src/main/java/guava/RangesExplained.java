package guava;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Range;

import java.time.LocalDate;

/**
 * https://github.com/google/guava/wiki/RangesExplained
 */
public class RangesExplained {

    public static void main(final String[] args) {
        Range<Integer> integerRange = Range.closedOpen(3, 20);
        System.out.println(integerRange.contains(3));
        System.out.println(integerRange.contains(20));
        System.out.println(Range.lessThan(LocalDate.now()).contains(LocalDate.parse("2017-10-01")));

        ImmutableSortedSet<Integer> set = ContiguousSet.create(Range.open(1, 5), DiscreteDomain.integers());
        System.out.println(set);
    }
}
