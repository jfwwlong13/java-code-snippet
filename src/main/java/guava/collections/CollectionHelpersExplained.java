package guava.collections;

import com.google.common.collect.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * https://github.com/google/guava/wiki/CollectionHelpersExplained
 */
public class CollectionHelpersExplained {

    public static void main(final String[] args) {
        System.out.println(peekIterator(ImmutableList.of(1, 3, 3, 5, 6, 2)));

        System.out.println(powersOfTwo.next());
        System.out.println(powersOfTwo.next());
        System.out.println(powersOfTwo.next());
    }

    static class AddLoggingList<E> extends ForwardingList<E> {
        final List<E> delegate = new ArrayList<>();

        @Override
        protected List<E> delegate() {
            return delegate;
        }

        @Override
        public void add(int index, E element) {
            System.out.println("logged it");
            super.add(index, element);
        }
    }

    private static <E> List<E> peekIterator(final List<E> source) {
        final List<E> result = Lists.newArrayList();
        final PeekingIterator<E> iter = Iterators.peekingIterator(source.iterator());
        while (iter.hasNext()) {
            final E current = iter.next();
            while (iter.hasNext() && iter.peek().equals(current)) {
                // skip this duplicate element
                iter.next();
            }
            result.add(current);
        }

        return result;
    }

    // AbstractIterator
    public static Iterator<String> skipNulls(final Iterator<String> in) {
        return new AbstractIterator<String>() {
            @Override
            protected String computeNext() {
                while (in.hasNext()) {
                    String s = in.next();
                    if (s != null) {
                        return s;
                    }
                }
                return endOfData();
            }
        };
    }

    // AbstractSequentialIterator
    static final Iterator<Integer> powersOfTwo = new AbstractSequentialIterator<Integer>(1) { // note the initial value!
        protected Integer computeNext(Integer previous) {
            return previous * 2;
        }
    };
}
