package Interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        //если метод в качестве параметра принимает родительский тип, то он принимает и всех наследников
        //делаем UPCAST- приводим всех наследников к родительскому типу
        System.out.println("\nUPCAST:");
        ArrayList<AnimalAbstract> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        animals.add(fish);

        //кормим всех животных))
        for (AnimalAbstract animal:animals){
            animal.eat();
        }
        //делаем DOWNCAST- приводим родителей к дочернему типу
        System.out.println("\nDOWNCAST:");
        AnimalAbstract animalDog = new Dog();
        animalDog.eat();
        //оборачиваем родительский объект в дочерний, тк только в дочернем классе Dog есть метод run
        Dog dog2 = (Dog) animalDog;
        dog2.itchy();

        //через интерфейс AbleToRun заставляем бегать всех тех, кто способен бежать
        System.out.println("\nчерез интерфейс AbleToRun заставляем бегать всех тех, кто способен бежать:");
        ArrayList<AbleToRun> animalsWichCanRun = new ArrayList<>();
        animalsWichCanRun.add(cat);
        animalsWichCanRun.add(dog);
        animalsWichCanRun.add(bird);
        for(AbleToRun animal:animalsWichCanRun){
            animal.run();
        }
        AbleToFly ableToFly = new Bird(); // upcast
        ableToFly.fly();
    }
}
