public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Nguyen", "Sin", 10000000);
        System.out.println(employee.getFullName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.toString());
        System.out.println("Salary up to: " + employee.upToSalary(10));
    }
}
