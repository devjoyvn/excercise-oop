public class Main {

    public static void main(String[] args) {
        Person student = new Student("H", "DN", "CHINH QUY", 3, 6.7);
        Person staff = new Staff("D", "BT", "KHTN", 12.5);
        System.out.println(((Student) student).getRating());
        System.out.println(((Staff) staff).upToSalary(40));

    }
}
