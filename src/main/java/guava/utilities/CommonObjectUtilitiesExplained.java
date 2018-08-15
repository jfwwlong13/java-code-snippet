package guava.utilities;

//import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

/**
 * https://github.com/google/guava/wiki/CommonObjectUtilitiesExplained
 */
public class CommonObjectUtilitiesExplained {

    public static void main(final String[] args) {
        //Note: The newly introduced Objects class in JDK 7 provides the equivalent Objects.equals method.
        System.out.println(Objects.equal("a", "a"));
        System.out.println(Objects.equal(null, "a"));
        System.out.println(Objects.equal("a", null));
        System.out.println(Objects.equal(null, null));

        //Note: The newly introduced Objects class in JDK 7 provides the equivalent Objects.hash(Object...).
        System.out.println(Objects.hashCode("1", "2", "3"));

        //String s = MoreObjects.toStringHelper(CommonObjectUtilitiesExplained.class)
            //    .add("x", 1).add("y", "22").toString();
        //System.out.println(s);

        System.out.println(ComparisonChain.start().compare("a", "b").compare(2, 1).result());
        System.out.println(ComparisonChain.start().compare("b", "b").compare(2, 1).result());
        System.out.println(ComparisonChain.start().compare("b", "b").compare(2, 2).result());
    }
}
