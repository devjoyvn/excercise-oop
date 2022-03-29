package entity;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee {

    private LocalDate graduationDate;
    private String graduationRank;
    private String universityName;

    public Fresher() {
    }

    public Fresher(LocalDate graduationDate, String graduationRank, String universityName) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
    }

    public Fresher(String id, String fullName, LocalDate birthday, String phone, String email, List<Certificate> certificates, LocalDate graduationDate, String graduationRank, String universityName) {
        super(id, fullName, birthday, phone, email, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return universityName;
    }

    public void setEducation(String education) {
        this.universityName = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
