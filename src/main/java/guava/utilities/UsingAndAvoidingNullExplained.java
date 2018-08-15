package guava.utilities;

//import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Strings;

/**
 * https://github.com/google/guava/wiki/UsingAndAvoidingNullExplained
 */
public class UsingAndAvoidingNullExplained {

    public static void main(final String[] args) {
        final Optional<Integer> possible = Optional.of(5);
        System.out.println(possible.isPresent());
        System.out.println(possible.get());

    //    System.out.println(MoreObjects.firstNonNull(null, "not null"));

        System.out.println(Strings.emptyToNull(""));
        System.out.println(Strings.emptyToNull(null));
        System.out.println(Strings.emptyToNull("not empty"));

        System.out.println(Strings.nullToEmpty(null));
        System.out.println(Strings.nullToEmpty("not null"));
    }
}
