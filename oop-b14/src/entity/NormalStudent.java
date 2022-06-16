package entity;

public class NormalStudent extends Student{
    Integer englishScore;
    Float entryTestScore;

    public NormalStudent(String fullName, String dob, String gender, String phoneNumber, String universityName, String gradeLevel, Integer englishScore, Float entryTestScore) {
        super(fullName, dob, gender, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public Integer getEnglishScore() {
        return englishScore;
    }
}
