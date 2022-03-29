
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public boolean isLeapYear() {
        if (this.year % 400 == 0)
            return true;

        // Nếu số năm chia hết cho 4 và không chia hết cho 100,
        // đó không là 1 năm nhuận
        if (this.year % 4 == 0 && this.year % 100 != 0)
            return true;

        return false;
    }
}
