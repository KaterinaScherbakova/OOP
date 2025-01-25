package Person;

public class Main {
    public static void main(String[] args) {
        Person jack = new Person("Jack", 26);
        jack.setAge(4);
        System.out.println("Name: "+jack.getName()+" // Age "+jack.getAge());
    }
}
