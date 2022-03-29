package b7;

import java.util.ArrayList;
import java.util.List;

public class ManagerTeacher {
    private List<Teacher> teachers;

    public ManagerTeacher() {
        this.teachers = new ArrayList<>();
    }

    public void add(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public boolean deleteById(String id) {
        Teacher teacher = this.teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return false;
        }
        this.teachers.remove(teacher);
        return true;
    }

    public double getSalary(String id) {
        Teacher teacher = this.teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return 0;
        }
        return teacher.getSalary() + teacher.getBonus() + teacher.getPenaty();
    }
}
