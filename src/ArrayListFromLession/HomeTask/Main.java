package ArrayListFromLession.HomeTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // создали коллекцию с номерами- индексами
        ArrayList<Integer> numbersOfPepsons = new ArrayList<>();
        for (int i = 0; i<5; i++){
            numbersOfPepsons.add(i);
        }
        // создали коллекцию с Именами людей
        ArrayList<String> persons = new ArrayList<>();
        persons.add("Kate");
        persons.add("Lin");
        persons.add("Fin");
        persons.add("Bin");
        persons.add("Lana");

        //на основе двух предыдущих создаем коллекцию, хранящую строки <номер:имя>
        ArrayList<String> numPlusName = new ArrayList<>();
        for(int i = 0; i< numbersOfPepsons.size(); i++){
            numPlusName.add(numbersOfPepsons.get(i)+":"+persons.get(i));
        }

        //print all
        for(String string : numPlusName){
            System.out.println(string);
        }
    }
}
