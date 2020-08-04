package Structural.Package1.Adapter.Demo3;

public class AdapterDemoAfter {

    public static void main(String[] args) {
        Shape1 shape1 = new LineAdapter(new Line1());
        shape1.draw(1,2,3,4);
    }
}

interface Shape1 {
    void draw(int x, int y, int z, int j);
}

class Line1 {
    public void draw(int x1, int y1 , int x2, int y2){
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}

class Rectangle1 {
    public void draw(int x, int y, int width, int height){
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }


}

class LineAdapter implements Shape1 {
    private Line1 adaptee;

    public LineAdapter(Line1 line1){
        this.adaptee = line1;
    }

    @Override
    public void draw(int x, int y, int z, int j) {
       adaptee.draw(x,y,z,j);
    }
}
