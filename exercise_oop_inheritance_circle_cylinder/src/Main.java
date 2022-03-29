public class Main {

    public static void main(String[] args) {
        Circle cylinder = new Cylinder(2.4, "red", 10);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + ((Cylinder) cylinder).getVolumer());
    }
}
