package filesystem;

import visitor.Visitor;

public interface FileSystemElement {
    void accept(Visitor visitor);
}