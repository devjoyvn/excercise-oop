
public class Student {
    private String name;
    private int age;
    private double score;
    private Address address;

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRating() {
        if (this.score < 5.0) {
            return "bad";
        } else if (this.score >= 5.0 && this.score < 8.0) {
            return "medium";
        } else {
            return "good";
        }
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", address=" + address.toString() +
                '}';
    }
}
