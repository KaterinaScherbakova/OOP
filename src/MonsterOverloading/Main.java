package MonsterOverloading;

public class Main {
    public static void main(String[] args) {
        //1 - из первого конструктора
        Monster momonster = new Monster();
        System.out.println("momonster из 1го конструктора:");
        System.out.println(momonster.getEyes());
        System.out.println(momonster.getHands());
        System.out.println(momonster.getLegs());
        momonster.voice(3);

        //2 - из второго конструктора

        Monster mimonster = new Monster(5);
        System.out.println("\nmimonster из 2го конструктора:");
        System.out.println(mimonster.getEyes());
        System.out.println(mimonster.getHands());
        System.out.println(mimonster.getLegs());
        mimonster.voice(2, "MIMIMI!");

        //3 - из третьего конструктора
        Monster mymonster = new Monster(1,2,3);
        System.out.println("\nmymonster из 3го конструктора:");
        System.out.println(mymonster.getEyes());
        System.out.println(mymonster.getHands());
        System.out.println(mymonster.getLegs());
        mymonster.voice();

    }
}
