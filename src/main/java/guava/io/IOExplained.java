package guava.io;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;
import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * https://github.com/google/guava/wiki/IOExplained
 */
public class IOExplained {

    public static void main(final String[] args) throws IOException {
        new IOExplained().asdf();
    }

    private void asdf() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("guava/io/text").getFile());
        ImmutableList<String> lines = Files.asCharSource(file, Charsets.UTF_8)
                .readLines();
        System.out.println(lines);
        System.out.println(Files.asByteSource(file).hashCode());
    }
}
