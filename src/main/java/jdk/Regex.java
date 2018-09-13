package jdk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(final String[] args) {
        pattern1();
        System.out.println("===================");
        pattern2();
        System.out.println("===================");
        pattern3();
    }

    private static void pattern1() {
        final Pattern pattern = Pattern.compile("asdf*");
        final Matcher matcher = pattern.matcher("asdfqwers");
        System.out.println(matcher.find());
        System.out.println(matcher.groupCount());
        System.out.println(matcher.group(0));
    }

    private static void pattern2() {
        final Pattern pattern = Pattern.compile("asdf*");
        final Matcher matcher = pattern.matcher("asdfqwers");
        System.out.println(matcher.matches());
        System.out.println(matcher.find());
    }

    private static void pattern3() {
        final Pattern pattern = Pattern.compile("asdf.*");
        final Matcher matcher = pattern.matcher("asdfasdf");
        System.out.println(matcher.matches());
        System.out.println(matcher.group());
    }
}
