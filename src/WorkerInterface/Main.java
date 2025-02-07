package WorkerInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Director boss = new Director();
        Programmer geek = new Programmer();
        Chef povar = new Chef();

        //дитектор из-за force может только заставить работать кого-то
        System.out.println("Директор заставляет работать программиста, а сам спит:");
        boss.force(geek);

        //через интерфейс Worker заставляем работать всех тех, кто способен работать
        System.out.println("\nList of workers:");
        ArrayList<Worker> whoCanWork= new ArrayList<>();
        whoCanWork.add(geek);
        whoCanWork.add(povar);
        for (Worker who: whoCanWork){
            who.work();
        }

        //через интерфейс Driver заставляем водить всех тех, кто способен на это
        System.out.println("\nList of drivers:");
        ArrayList<Driver> whoIsDrivers = new ArrayList<>();
        whoIsDrivers.add(povar);
        whoIsDrivers.add(geek);
        for (Driver driver:whoIsDrivers){
            driver.drive();
        }

    }
}
