package Interfaces;

public class Bird extends AnimalAbstract implements AbleToFly, AbleToRun{
    @Override
    public void eat() {
        System.out.println("eat grain");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }
}