package ShapeClass;

public class Main {
    public static void main(String[] args) {
        // создаем прямоугольник
        Rectangle rec = new Rectangle(10,15);
        //создаем треугольник
        Triangle tr = new Triangle(5,6,8);

        rec.showPerimeter();
        tr.showPerimeter();

    }
}
