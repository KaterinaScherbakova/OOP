package FirstSteps;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Из задачи с коробками, класс BoxClass:");
        BoxClass box1 = new BoxClass(10, 10, 10);

        BoxClass box2 = new BoxClass(40, 50, 60);
        box2.showVolume();

        System.out.println(box1.getVolume());

        BoxClass box3 = new BoxClass(30.5);
        box3.showVolume();

        BoxClass box25 = new BoxClass();
        box25.showVolume();

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
    }
}