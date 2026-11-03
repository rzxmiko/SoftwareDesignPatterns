package visitor;

import filesystem.File;
import filesystem.Directory;

public class FileCountVisitor implements Visitor {
    private int count = 0;

    @Override
    public void visitFile(File file) {
        count++;
    }

    @Override
    public void visitDirectory(Directory directory) {
    }

    public int getCount() {
        return count;
    }
}