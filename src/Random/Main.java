package Random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(); // random int
        System.out.println(a);
        // в диапазоне от 0 до 10 не включительно. Если нужно вкл 10, то передаем 11 как границу
        int b = random.nextInt(10);
        System.out.println(b);
        // в диапазоне от 5 до 11
        int с = random.nextInt(5, 11);
        System.out.println(с);
        // Броски кубиков
        GameToss gt = new GameToss();
        for (int i=0;i<5; i++){
            gt.Game();
        }

    }
}
