package entity;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {
    private int yearOfExperience;
    private String proSkill;

    public Experience() {
    }

    public Experience(int yearOfExperience, String proSkill) {
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    public Experience(String id, String fullName, LocalDate birthday, String phone, String email, List<Certificate> certificates, int yearOfExperience, String proSkill) {
        super(id, fullName, birthday, phone, email, certificates);
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
