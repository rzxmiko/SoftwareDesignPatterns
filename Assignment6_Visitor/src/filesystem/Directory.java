package filesystem;

import visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addElement(FileSystemElement element) {
        children.add(element);
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDirectory(this);
        for (FileSystemElement element : children) {
            element.accept(visitor);
        }
    }
}