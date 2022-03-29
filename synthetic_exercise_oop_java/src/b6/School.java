package b6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudent20YearOld() {
        return this.students.stream().filter(student -> student.getAge() == 20).collect(Collectors.toList());
    }

    public long countStudent23YearOldInDN() {
        return this.students.stream().filter(student -> student.getAge() == 23 && student.getHometown().equals("DN")).count();
    }
}
