package filesystem;

import visitor.Visitor;
import java.util.List;
import java.util.Collections;

public interface FileSystemElement {
    void accept(Visitor visitor);

    default List<FileSystemElement> getChildren() {
        return Collections.emptyList();
    }
}