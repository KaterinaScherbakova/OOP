package MyArrayListCustom;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("Phillip");
        employees.remove("Bin");
        for(int i=0; i< employees.getSize();i++){
            System.out.println(employees.getString(i));
        }
    }

    private static MyArrayList getEmployees(){
        MyArrayList employees = new MyArrayList();
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

