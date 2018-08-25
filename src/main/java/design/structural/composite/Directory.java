package design.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {
    private final List<File> files = new ArrayList<>();
    private final String dirName;


    public Directory(final String dirName) {
        this.dirName = dirName;
    }

    @Override
    public void add(final File file) {
        files.add(file);
    }

    @Override
    public String getName() {
        return dirName;
    }

    @Override
    public void print() {
        System.out.print(dirName + ":{");
        files.forEach(File::print);
        System.out.print("},");
    }
}
