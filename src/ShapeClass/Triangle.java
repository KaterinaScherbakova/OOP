package ShapeClass;

public class Triangle extends ShapeAbstract {
    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    // делаем геттер final, чтобы запретить их переопределение
    public final int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return getA()+getB()+getC();
    }

}
