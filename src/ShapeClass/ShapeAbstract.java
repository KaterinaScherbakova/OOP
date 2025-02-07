package ShapeClass;

public abstract class ShapeAbstract {
    private int a;
    private int b;

    public ShapeAbstract(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // делаем геттеры final, чтобы запретить их переопределение
    public final int getA() {
        return a;
    }
    public final int getB() {
        return b;
    }
    //периметр
    public abstract int getPerimeter();//так как будем переопределять метод в наследниках
    public final void showPerimeter(){
        System.out.println(getPerimeter());
    }

}
