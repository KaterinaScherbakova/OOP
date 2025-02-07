package ShapeClass;

public class Rectangle extends ShapeAbstract {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int getPerimeter() {
        return (getA()+getB()) * 2;
    }

}
