package visitor;

import filesystem.File;
import filesystem.Directory;

public class SizeCalculatorVisitor implements Visitor {
    private long totalSize = 0;

    @Override
    public void visitFile(File file) {
        totalSize = Math.addExact(totalSize, file.getSizeBytes());
    }

    @Override
    public void visitDirectory(Directory directory) {
    }

    public long getTotalSize() {
        return totalSize;
    }
}