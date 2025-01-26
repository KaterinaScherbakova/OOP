package ArrayListFromLession;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // в <> (дженерик) мы указали ССЫЛОЧНЫЙ тип данных, который собираемся сложить в ArrayList
        // (в тч принимать можем объекты, созданные самостоятельно - например Box или Dogs)!!!
        ArrayList<String> employees = getEmployees();
        employees.add("Phillip");
        employees.remove("Bin");
        for (String employee : employees) {
            System.out.println(employee);
        }
        // НЕЛЬЗЯ в <> использовать примитивные типы, ТОЛЬКО ссылочные:
        // если нужно принять int, то придется создать оболочку Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        //заполним созданную коллекцию числами от 0 до 5
        for (int i = 0; i<5; i++){
            numbers.add(i);
        }
        //выведем все числа
        for (int num: numbers){
            System.out.println(num);
        }
    }

    private static ArrayList<String> getEmployees(){
        // в часть после new <> мы можем не указывать конкретный тип- те любой тип данных готовы будем принимать
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Kate");
        employees.add("Lin");
        employees.add("Fin");
        employees.add("Bin");
        employees.add("Lana");
        employees.add("Kira");
        employees.add("Susanna");
        employees.add("Mister X");
        return employees;
    }
}

