public class Cylinder extends Circle {
    private double heigth;

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getVolumer() {
        return super.getArea() * this.heigth;
    }

}
