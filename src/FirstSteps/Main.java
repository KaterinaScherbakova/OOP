public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.width = 10;
        box1.length = 10;
        box1.height = 10;

        Box box2 = new Box();
        box2.width = 40;
        box2.length = 50;
        box2.height = 60;

        System.out.println(box1.getVolume());
    }
}