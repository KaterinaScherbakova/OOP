package Inheritance;

public class Cat extends CatFamily{
    public Cat(int legs,int eyes, boolean canEatPerson) {
        super(4, 2, false);
    }
    public void eat(){
        System.out.println("Кушаю вискас");
    }

}
