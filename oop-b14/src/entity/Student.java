package entity;

public class Student {
    String fullName;
    String dob;
    String gender;
    String phoneNumber;
    String universityName;
    String gradeLevel;

    public Student(String fullName, String dob, String gender, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getLastName() {
        String[] nameSplit = fullName.split(" ");
        return nameSplit[nameSplit.length - 1];
    }
}
