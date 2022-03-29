package b6;

public class Student {
    private String name;
    private int age;
    private String hometown;
    private int classStudent;

    public Student(String name, int age, String hometown, int classStudent) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.classStudent = classStudent;
    }

    public int getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(int classStudent) {
        this.classStudent = classStudent;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
