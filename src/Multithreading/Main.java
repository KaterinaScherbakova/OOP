package Multithreading;
//нужно создать два таймера, каждый в своем потоке. Когда значение первого =5, то второй должен прекратить работу
public class Main {
    static boolean isFive = false; // создали глобальную переменную для метода мэйн, тк после psvm нельзя объявлять переменную, переписываемую в потоках
    public static void main(String[] args) {
        //создаем анонимный класс с единственным методом run()
        //ПЕРВЫЙ ПОТОК
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (i == 5){
                        isFive = true;
                    }
                    System.out.println("Первый таймер: "+i);
                    try {
                        Thread.sleep(1000);// поток уснет на секунду, симулируя работу таймера
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread.start();

        //ВТОРОЙ ПОТОК
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (isFive){
                        break;
                    }
                    System.out.println("Второй таймер: "+i);
                    try {
                        Thread.sleep(1000);// поток уснет на секунду, симулируя работу таймера
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread2.start();
    }
}
