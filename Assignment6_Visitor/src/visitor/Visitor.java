package visitor;

import filesystem.File;
import filesystem.Directory;

public interface Visitor {
    void visitFile(File file);
    void visitDirectory(Directory directory);
}