package Interfaces;

public class Cat extends AnimalAbstract implements AbleToRun{
    @Override
    public void eat() {
        System.out.println("cat's food");
    }
    @Override
    public void run(){
        System.out.println("Cat is running");
    }
}
