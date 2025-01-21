package FirstSteps;
public class DodsClass {
    //создаем поля класса:
    String name;
    String breed;
    double width;
    int speed;

    //создаем метод, возвращающий всю инфу о собаке через имя:
    String getDogInfo(){
        return String.format("Имя: %s, Порода: %s, Вес: %f", name, breed, width);
    }
    //создаем метод, который печатает слово "Бегу" столько же раз, сколько указано в переменной скорости:
    void run(){
        for (int i=0; i < speed; i++){
            System.out.println("Бегу");
        }
    }


}
