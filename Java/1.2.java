// EX 1.2 Write a program that takes a year from the user and print whether that year is a leap year or not.
// Write a program that takes a year from the user and print whether that year is a leap year or not. 
// Test Data

// Input the year: 2016

// Expected Output : True
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int year = scanner.nextInt();
            if ( year % 4 == 0 && year % 100 != 0) {
                System.out.print("True");
            }
            else if ( year % 400 == 0) {
                System.out.print("True");
            }
            else {
                System.out.print("False");
            }
        }
    }
}
