package FirstSteps;

public class WeightBox extends Box {
    private double weight;

    public WeightBox(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public WeightBox() {
        this.weight = 10;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" /weight="+weight);
    }
}
