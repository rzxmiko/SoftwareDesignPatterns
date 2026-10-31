package visitor;

import filesystem.File;
import filesystem.Directory;
import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements Visitor {
    private String extension;
    private List<File> matchedFiles = new ArrayList<>();

    public SearchVisitor(String extension) {
        this.extension = extension;
    }

    @Override
    public void visitFile(File file) {
        if (file.getName().endsWith(extension)) {
            matchedFiles.add(file);
        }
    }

    @Override
    public void visitDirectory(Directory directory) {
    }

    public List<File> getMatchedFiles() {
        return matchedFiles;
    }
}