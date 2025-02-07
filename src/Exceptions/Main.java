package Exceptions;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7/a;
            int c = Integer.parseInt("dfvdv");
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (NumberFormatException e1){
            System.out.println("Number Format Exception");
        }
        System.out.println("Hello");

        //в таком случае обработаются абсолютно все исключения, тк Exception - родительский класс исключений
        // catch (Exception e)
        // System.out.println("Поймано исключение "+e.getClass());

        //вызовем ArrayIndexOutOfBoundsException и обработаем
        int[] myArray = new int[2];
        try {
            for (int i=0; i<=myArray.length;i++){
                System.out.println(myArray[i]);}
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("выход за границы массива");
            }

    }

}
