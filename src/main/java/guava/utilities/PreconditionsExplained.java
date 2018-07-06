package guava.utilities;

import com.google.common.base.Preconditions;

/**
 * https://github.com/google/guava/wiki/PreconditionsExplained
 *
 * We recommend that you split up preconditions into distinct lines, which can help you figure out which precondition failed while debugging.
 * Additionally, you should provide helpful error messages, which is easier when each check is on its own line.
 */
public class PreconditionsExplained {

    public static void main(final String[] args) {
        final String s1 = "not null";
        final String s2 = null;
        final String s3 = "not null";
        System.out.println(Preconditions.checkNotNull(s1));
        // This is why Preconditions is preferred to Objects.requireNonNull(), it supports template message
        try {
            // Only %s is supported
            Preconditions.checkNotNull(s2, "You input has %s error", "null");
        } catch (final Exception e) {
            e.printStackTrace();
        }

        try {
            Preconditions.checkState(s1 != s3, "The state is: %s", "not null");
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
