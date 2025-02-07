package Inheritance;

public class Cat extends CatFamily{
    public Cat(int legs,int eyes, boolean canEatPerson) {
        super(4, 2, false);
    }
    // CTRL + O - перепределение метода
    @Override
    public void eat(){
        super.eat(); // вызываем метод родителя
        System.out.println("вискас"); // переопредененная часть
    }


}
