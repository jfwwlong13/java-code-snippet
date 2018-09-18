package jdk;

public class GcSnippet {

    public static void main(final String[] args) {
        System.out.println("Begin");
        int i = 0;
        while (i < 100) {
            i++;
        }
        System.out.println("End");
        System.out.println(i);
    }
}
