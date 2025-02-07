package Interfaces;

public class Dog extends AnimalAbstract implements AbleToRun{
    @Override
    public void eat() {
        System.out.println("dog's food and meat!");
    }
    @Override
    public void run(){
        System.out.println("Dog is running");
    }
    public void itchy(){
        System.out.println("Собака чешется");
    }
}