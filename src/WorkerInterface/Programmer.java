package WorkerInterface;

public class Programmer implements Worker, Driver{
    @Override
    public void work() {
        System.out.println("Programmer is working sooo hard");
    }

    @Override
    public void drive() {
        System.out.println("Programmer drives a red car");
    }
}
