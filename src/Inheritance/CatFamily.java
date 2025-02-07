package Inheritance;

public class CatFamily {
    private int legs;
    private int eyes;
    protected boolean canEatPerson;

    public CatFamily(int legs, int eyes, boolean canEatPerson){
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }
    public void eat(){
        System.out.println("Кушаю");
    }
}
