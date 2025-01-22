package FirstSteps;

public class Box {
    //создаем поля класса (переменные экземпляров):
    double length;
    double width;
    double height;

    // создаем конструктор класса для того, чтобы создавать объекты в дальнейшем согласно этой схеме
    // ALT + insert - быстрое создание конструктора

    Box(double length, double width, double height){
        this.length = length; // для присвоения с одинаковым именем в параметрах и переменных экземпляров- this.
        this.width = width;
        this.height = height;
    }
    //создаем ЕЩЕ один конструктор, который будет создавать куб c одинаковыми сторонами- т.е. используем ПЕРЕГРУЗКУ конструктора
    //когда имеем несколько методов или конструкторов с одинаковыми названиями, но РАЗНЫМИ входными параметрами
    // (могут отличаться так же по типу- принимать инт в одном случае, дабл в другом)

    Box(double size) {
        this.length = size;
        this.width = size;
        this.height = size;
    }

    //чтобы избежать дублирования кода мы можем создать конструктор, используя уже существующий конструктор!!!
    // этот будет создавать куб со сторонами 25 и типом double:

    Box() {
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

    //метод, принимающий объекты и сравнивающий их.
    // Для текущей коробки если вызвать метод, передав вторую коробку- то метод их сравнит
    void compare(Box another){
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume){
            System.out.println("current box > another box");
        } else if (currentVolume < anotherVolume) {
            System.out.println("current box < another box");
        } else {
            System.out.println("current box == another box");
        }
    }
    // такой же метод сравнения двух коробок, только возвращает инт!
    int compareReturnInt(Box another){
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume){
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        } else {
            return 0;
        }
    }
    // метод создания копии коробки
    Box copyBox(){
        return new Box(this.length, this.width, this.height);
    }


}
