package Random;

import java.util.Random;
/**@brief имитирует бросок двух кубиков
 */
public class GameToss {
    private Random randomToss;
    private int firstToss;
    private int secondToss;

    public void Game() {
        randomToss = new Random();
        this.firstToss = randomToss.nextInt(1,7);
        this.secondToss = randomToss.nextInt(1,7);
        System.out.println(String.format("Бросок: %d, %d",firstToss,secondToss));
    }
}