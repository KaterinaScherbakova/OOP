package AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeAnOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Я принес Вам: " + dish);
            }
        }, "Пицца");
    }
}
