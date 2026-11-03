import filesystem.Directory;
import filesystem.File;
import filesystem.FsWalker;
import visitor.SearchVisitor;
import visitor.SizeCalculatorVisitor;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");

        Directory src = new Directory("src");
        src.addElement(new File("Main.java", 1500));
        src.addElement(new File("Utils.java", 800));

        Directory docs = new Directory("docs");
        docs.addElement(new File("report.pdf", 45000));
        docs.addElement(new File("notes.txt", 300));

        root.addElement(src);
        root.addElement(docs);
        root.addElement(new File(".gitignore", 120));

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        FsWalker.walk(root, sizeVisitor);
        System.out.println("Total file system size: " + sizeVisitor.getTotalSize() + " bytes");

        SearchVisitor searchVisitor = new SearchVisitor(".java");
        FsWalker.walk(root, searchVisitor);

        System.out.println("\nFiles found with extension '.java':");
        for (File f : searchVisitor.getMatchedFiles()) {
            System.out.println(" - " + f.getName() + " (" + f.getSizeBytes() + " bytes)");
        }
    }
}