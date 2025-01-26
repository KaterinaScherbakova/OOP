package ArrayListFromLession;

import java.util.Objects;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String element){
        array[size] = element;
        size++;
        if(size == array.length){
            String[] newArray = new String[array.length*2];
            for(int i=0; i< array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray; // в старую переменную кладем новый удлиненный массив
        }
    }
    // начнем проход с интекса, требующего удаления и перезапишем все значения после него (array[5] = array[6])
    public void remove(int index){
        for(int i = index; i< size-1; i++){
            array[i] = array[i+1];

        }
        array[size] = null;
        size--;
    }
    //удалить элемент по названию
    public void remove(String element){
        for(int i = 0; i < size; i++){
            if (Objects.equals(element, array[i])){
                remove(i);
                return;
            }
        }
    }

    // геттер на размер коллекции
    public int getSize() {
        return size;
    }
    // геттер на получение значения по индексу
    public String getString(int index){
        return array[index];
    }
}
