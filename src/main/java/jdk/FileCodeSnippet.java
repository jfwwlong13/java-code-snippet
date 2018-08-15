package jdk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCodeSnippet {

    public static void main(final String[] args) throws IOException {
        // Copy a file to another file
        final Path target = Paths.get("src/main/resources/guava/io/copied.txt");
        final Path source = Paths.get("src/main/resources/guava/io/text");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
