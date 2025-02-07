package Inheritance;

public class Lion extends CatFamily{
    public Lion(){
        super(4,2,false);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("антилопу");
    }

}
