package Person;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){

        if (age>=0) {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //переопределим метод toString, наследуемый у всех объектов от Object
    @Override
    public String toString() {
        return String.format("Name: %s Age: %s",name,age);
    }
}
