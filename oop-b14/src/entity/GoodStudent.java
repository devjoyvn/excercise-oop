package entity;

public class GoodStudent extends Student {
    Float gpa;
    String bestRewardName;


    public GoodStudent(String fullName, String dob, String gender, String phoneNumber, String universityName, String gradeLevel, Float gpa, String bestRewardName) {
        super(fullName, dob, gender, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public Float getGpa() {
        return gpa;
    }

}
