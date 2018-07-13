package guava;

import com.google.common.base.*;

import java.nio.charset.StandardCharsets;

/**
 * https://github.com/google/guava/wiki/StringsExplained
 */
public class StringsExplained {

    public static void main(final String[] args) {
        // Joiner
        final String result = Joiner.on(", ").skipNulls().join("jianfu", "feixiong", null, "xinxing");
        System.out.println(result);
        // Splitter
        final Iterable<String> split = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("foo,bar,,   qux");
        System.out.println(split);
        // CharMatcher
        String abc123ASD = CharMatcher.javaDigit().or(CharMatcher.javaUpperCase()).retainFrom("abc123ASD as1");
        System.out.println(abc123ASD);
        // Charsets. Deprecated, should use Java's StandardCharsets
        byte[] bytes = "张炯熊".getBytes(Charsets.UTF_8);
        byte[] bytes_java = "张炯熊".getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes) {
            System.out.println(b);
        }
        for (byte b : bytes_java) {
            System.out.println(b);
        }
        // CaseFormat
        String constant_name = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME");
        System.out.println(constant_name);
        // Strings
        System.out.println(Strings.isNullOrEmpty(null));
    }
}
