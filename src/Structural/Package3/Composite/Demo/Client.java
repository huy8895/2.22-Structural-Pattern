package Structural.Package3.Composite.Demo;

import java.util.Arrays;
import java.util.List;

public class Client  {
    public static void main(String[] args) {
        FileComponent file1 = new FileLeaf("file 1", 10);
        FileComponent file2 = new FileLeaf("file 1", 10);
        FileComponent file3 = new FileLeaf("file 1", 10);

        List<FileComponent> files = Arrays.asList(file1,file2,file3);
        FileComponent folder = new FolderComposite(files);
        folder.showProperty();
        System.out.println("total size: " + folder.totalSize());


    }

}
