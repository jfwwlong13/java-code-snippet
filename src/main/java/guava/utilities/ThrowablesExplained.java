package guava.utilities;

import com.google.common.base.Throwables;

import java.io.IOException;

/**
 * https://github.com/google/guava/wiki/ThrowablesExplained
 *
 * Throwables.propagate() is deprecated
 *
 */
public class ThrowablesExplained {

    public static void main(final String[] args) throws IOException {
        try {
            qwer();
        } catch (Exception e) {
            Throwables.propagateIfPossible(e, IOException.class);
            throw new RuntimeException(e);
        }

    }

    private static void asdf() throws IOException {
        throw new IOException();
    }

    private static void qwer() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

}
