package filesystem;

import visitor.Visitor;

public class FsWalker {
    public static void walk(FileSystemElement element, Visitor visitor) {
        element.accept(visitor);
        for (FileSystemElement child : element.getChildren()) {
            walk(child, visitor);
        }
    }
}