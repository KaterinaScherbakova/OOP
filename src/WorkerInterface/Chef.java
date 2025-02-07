package WorkerInterface;

public class Chef implements Worker,Driver{
    @Override
    public void drive() {
        System.out.println("Chef drives a white car");
    }

    @Override
    public void work() {
        System.out.println("Chef is making delicious pies");
    }
}
