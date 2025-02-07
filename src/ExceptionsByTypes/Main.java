package ExceptionsByTypes;

public class Main {
    public static void main(String[] args) {
        //NullPointerException
        //Сценарий: у вас есть метод, который обращается к объекту, имеющему значение null
        try {
            String title= null;
            System.out.println(title.length()); // Это вызовет NullPointerException
        } catch (NullPointerException e){
            System.out.println("у вас есть метод, который обращается к объекту, имеющему значение null");
        }

        //ArrayIndexOutOfBoundsException
        //Сценарий: вы пытаетесь получить доступ к массиву с индексом, который находится за пределами его границ.
        try{
            int[] numbers = {4, 5, 6};
            System.out.println(numbers[3]);   // Это вызовет ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("вы пытаетесь получить доступ к массиву с индексом, который находится за пределами его границ.");
        }
        // ClassCastException
        //Сценарий: вы пытаетесь привести объект к типу, несовместимому с его фактическим типом.

        try{
            Object obj = "Java Exception";
            Integer number = (Integer) obj; // Это вызовет ClassCastException
        } catch (ClassCastException e){
            System.out.println("вы пытаетесь привести объект к типу, несовместимому с его фактическим типом.");
        }
        //IllegalArgumentException
        //Сценарий: Вы передали недопустимый аргумент методу.



    }
}
