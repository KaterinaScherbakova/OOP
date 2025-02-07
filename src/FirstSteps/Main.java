package FirstSteps;

public class Main {
    public static void main(String[] args) {
        System.out.println("Из задачи с коробками, класс BoxClass:");
        Box box1 = new Box(10, 10, 10);

        Box box2 = new Box(40, 50, 60);
        box2.showVolume();

        System.out.println(box1.getVolume());

        Box box3 = new Box(30.5);
        box3.showVolume();

        Box box25 = new Box();
        box25.showVolume();

        //сравним две коробки
        box25.compare(box3);
        System.out.println("сравнение методом compareReturnInt: "+box25.compareReturnInt(box3));
        // copy
        Box copyBox = box3.copyBox();
        System.out.println("скоприровали коробку "+copyBox.getVolume());

        // задача с собаками
        System.out.println("\nИз задачи с собаками, класс DogsClass:");
        DodsClass dog1 = new DodsClass();
        dog1.name = "Jack";
        dog1.breed = "Unknown";
        dog1.width = 9.6;
        dog1.speed = 3;
        System.out.println(dog1.getDogInfo());
        dog1.run();

        // задача с прямоугольником, Rectangle:
        System.out.println("\nИз задачи с прямоугольником, класс Rectangle:");
        Rectangle rect = new Rectangle();
        rect.setParams(10, 15);
        System.out.println("Площадь прямоугольника равна "+rect.getSquare());

        // задача с сотрудником, Employee:
        System.out.println("\nИз задачи с прямоугольником, класс Employee:");
        Employee newEmployee = new Employee("Li", "QA", 30);
        newEmployee.showInfo();

        // задача с наследуемой коробкой с весом, WeightBox:
        System.out.println("\n задача с наследуемой коробкой с весом, WeightBox:");
        WeightBox boxWeight1 = new WeightBox(10,15,20,9);
        boxWeight1.showInfo();

    }


}