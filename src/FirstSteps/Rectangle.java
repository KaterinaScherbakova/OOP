package FirstSteps;

public class Rectangle {
    double height;
    double length;
    //метод, который устанавливает значение переданных параметров
    void setParams(double height, double length) {
        this.height = height;
        this.length = length;
    }
    double getSquare(){
        return height*length;
    }
}
