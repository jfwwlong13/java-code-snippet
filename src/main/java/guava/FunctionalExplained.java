package guava;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import javax.annotation.Nullable;
import java.util.Collection;

/**
 * https://github.com/google/guava/wiki/FunctionalExplained
 *
 * Java 8 includes the java.util.function and java.util.stream packages,
 * which supercede Guava's functional programming classes for projects at that language level.
 *
 * Imperative code should be your default, your first choice as of Java 7.
 * You should not use functional idioms unless you are absolutely sure of one of the following:
 *
 * Use of functional idioms will result in net savings of lines of code for your entire project.
 * For efficiency, you need a lazily computed view of the transformed collection and cannot settle for an explicitly computed collection.
 */
public class FunctionalExplained {

    public static void main(final String[] args) {

    }
}
