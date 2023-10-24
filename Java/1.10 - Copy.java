// EX 1.10 Write a program to get next day of a given date
// Write a program to get next day of a given date.

// Please don't use any library of Java. 

// Test data 1
// Input: 2020, 02, 29
// Output: 2020, 03, 01
import java.util.Scanner;
public class Main {
    public static void main(String[] Strings) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        var year = string.substring(0,4);
        int nam = Integer.parseInt(year);
        var month = string.substring(6,8);
        int thang = Integer.parseInt(month);
        var day = string.substring(10,12);
        int ngay = Integer.parseInt(day);
        boolean nhuan = true;
        int i;
        if (nam % 400 == 0) {
            nhuan = true;
        }
        else if (nam % 100 == 0) {
            nhuan = false;
        }
        else if (nam % 4 == 0) {
            nhuan = true;
        }
        else {
            nhuan = false;
        }

        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            i = 31;
        }
        else if (thang == 2) {
            if (nhuan) {
                i =  29;
            }
            else {
                i = 28;
            }
        }
        else {
            i = 30;
        }

        if (ngay < i) {
            ngay = ngay + 1;
        }
        else {
            ngay = 1;
            if (thang == 12) {
                thang = 1;
                nam = nam + 1;
            }
            else {
                thang = thang + 1;
            }
        }
        System.out.print(nam);
        System.out.print(", ");
        if (thang < 10) {
            System.out.print("0");
            System.out.print(thang);
        }
        else {
            System.out.print(thang);
        }
        System.out.print(", ");
        if (ngay < 10) {
            System.out.print("0");
            System.out.print(ngay);
        }
        else {
        System.out.print(ngay);
        }
    }
}
