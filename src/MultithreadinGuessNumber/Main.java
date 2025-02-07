package MultithreadinGuessNumber;

import java.util.Random;

// создать игру, угадывающую число. Остановить потоки при угадывании.
public class Main {
    static boolean winner = false;
    public static void main(String[] args) {
        //сгенерировать случайное число от 0 до 100
        int bound = 1_000_000_000;
        Random randommm = new Random();
        int numberToGuess = randommm.nextInt(bound);
        System.out.println("Загадано число: " + numberToGuess);

        //сгенерить 1ый поток, пытающийся угадать число с помощью случайных чисел
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int toGuess;
                int attempt = 0;
                do {
                    toGuess = randommm.nextInt(bound);
                    attempt++;
                } while (toGuess != numberToGuess);
                winner = true;
                System.out.println(String.format("Угадали c %,d попытки!",attempt));
            }
        });
        thread.start();

        //сгенерить 2ой поток, выступающий таймером. Он будет выводить в консоль секунды, пока число не будет угадано
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (winner) {
                        break;
                    }
                    System.out.println("Таймер: "+i);
                    try {
                        Thread.sleep(1000);// поток уснет на секунду, симулируя работу таймера
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        timer.start();

    }

}
