package guava.collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

/**
 * https://github.com/google/guava/wiki/ImmutableCollectionsExplained
 *
 * Better than JDK's Collections.unmodifiableXXX
 */
public class ImmutableCollectionsExplained {

    public static void main(final String[] args) {
        final Set<Integer> set = ImmutableSet.of(1, 2, 3);
        // copyOf is smarter than you think
        ImmutableSet<Integer> copy = ImmutableSet.copyOf(set);
        ImmutableList<Integer> list = copy.asList();
    }
}
