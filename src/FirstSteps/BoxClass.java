package FirstSteps;

public class BoxClass {
    //создаем поля класса (переменные экземпляров):
    double length;
    double width;
    double height;

    // создаем конструктор класса для того, чтобы создавать объекты в дальнейшем согласно этой схеме
    // ALT + insert - быстрое создание конструктора

    BoxClass(double length, double width, double height){
        this.length = length; // для присвоения с одинаковым именем в параметрах и переменных экземпляров- this.
        this.width = width;
        this.height = height;
    }
    //создаем ЕЩЕ один конструктор, который будет создавать куб c одинаковыми сторонами- т.е. используем ПЕРЕГРУЗКУ конструктора
    //когда имеем несколько методов или конструкторов с одинаковыми названиями, но РАЗНЫМИ входными параметрами
    // (могут отличаться так же по типу- принимать инт в одном случае, дабл в другом)

    BoxClass(double size) {
        this.length = size;
        this.width = size;
        this.height = size;
    }

    //чтобы избежать дублирования кода мы можем создать конструктор, используя уже существующий конструктор!!!
    // этот будет создавать куб со сторонами 25 и типом double:

    BoxClass() {
        this(25);
    }

    //создаем методы:
    double getVolume() {
        return length * width * height;
    }
    //void - метод, который ничего не возвращает. Не юзаем ретерн (например, для print)
    void showVolume() {
        System.out.println(getVolume());
    }
}
