package Inheritance;

public class Lion extends CatFamily{
    public Lion(){
        super(4,2,false);
    }
    public void eat(){
        System.out.println("Кушаю антилопу");
    }

}
