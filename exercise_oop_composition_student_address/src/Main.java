public class Main {

    public static void main(String[] args) {
        Address address = new Address("VN", "HCM", "Q7", "428 LE VAN LUONG");
        Student student = new Student();
        student.setName("HGA");
        student.setAddress(address);
        student.setAge(23);
        student.setScore(5);
        System.out.println(student.toString());
        System.out.println("Xep loai: " + student.getRating());
    }
}
