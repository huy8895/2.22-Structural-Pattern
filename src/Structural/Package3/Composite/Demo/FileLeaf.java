package Structural.Package3.Composite.Demo;

public class FileLeaf implements FileComponent {
    private String name;
    private long size;

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println("FileLeaf [name = " + name + " ,size = " + size + "]");
    }

    @Override
    public long totalSize() {
        return size;
    }
}