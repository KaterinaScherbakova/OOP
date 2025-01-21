package MonsterOverloading;
public class Monster {
    int eyes;
    int legs;
    int hands;
    //КОНСТРУКТОРЫ (с оптимизацией)
    // 1 - принимает все 3 параметра
    public Monster(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }
    // 2 - конструктор, который принимает только 1 параметр -количество, который будет установлен всем полям
    public Monster(int count) {
        this(count,count,count);
    }
    // 3 - конструктор монстра без параметров. Устанавливает всем полям значение 2
    public Monster() {
        this(2,2,2);
    }

    //МЕТОДЫ (с оптимизацией)
    //выводит строку, которую говорит монстр (в параметре передаем ее) + количество раз из параметра
    void voice(int count, String word){
        for (int i = 0 ; i <count; i++) {
            System.out.println(word);
        }
    }
    //voice без параметров (на базе первого метода)
    void voice() {
        voice(1);
    }

    // выводит строку с рыком столько раз, сколько указали в параметре (на базе первого метода)
    void voice(int count){
        voice(count, "Grrrrrr....");
    }



    //геттеры

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getHands() {
        return hands;
    }
}
