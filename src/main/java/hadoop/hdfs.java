package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class hdfs {

    public static void main(final String[] args) throws IOException {
        readFromApi();
    }

    private static void readFromUrl() throws IOException {
        Stream<String> lines = Files.lines(Paths.get("hdfs:/var/a.txt"));
        lines.forEach(System.out::println);
    }

    private static void readFromApi() throws IOException {
        Configuration configuration = new Configuration();
        URI uri = URI.create("hdfs:///a.txt");
        FileSystem fileSystem = FileSystem.get(configuration);
        FSDataInputStream in = fileSystem.open(new Path(uri));
        IOUtils.copyBytes(in, System.out, 4096, false);
    }
}
