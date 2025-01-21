package FirstSteps;

public class Employee{
    String name;
    String position;
    double salary;

    // создаем конструктор класса для того, чтобы создавать объекты в дальнейшем согласно этой схеме
    // ALT + insert - быстрое создание конструктора
    Employee(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfo(){
        System.out.println(String.format("Имя: %s, Должность: %s, Salary: %f", name, position, salary));
    }
}

