package b4;

public class Person {
    private String name;
    private int age;
    private String job;
    private String passport;

    public Person(String name, int age, String job, String passport) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.passport = passport;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
