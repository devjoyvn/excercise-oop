public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private int salary;

    public Employee(int id, String lastName, String firstName, int salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return this.lastName + " " + this.firstName;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int upToSalary(int percent) {
        return this.salary +  (this.salary * percent)/100;
    }

    public String toString() {
        return this.getFullName() + " - " + "salary: " + this.salary;
    }
}


