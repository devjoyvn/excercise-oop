// EX 1.5. Write a program that accept an integer (n) from the user and outputs combinations that express n as a sum of two prime numbers.
// Write a program that accept an integer (n) from the user and outputs combinations that express n as a sum of two prime numbers.

// Example

// Input: 10

// Output: 7+3, 5+5
import java.util.Scanner;

public class Main {
    private static boolean isPrime(int a) {
        if ( a < 2) {
            return false;
        }
        for ( int i = 2; i < a; i++) {
            if ( a % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean first = true;
        for (int i = a -2; i >= a /2; i--) {
            if ( isPrime(i) && isPrime(a-i)) {
                if ( first == true) {
                    first = false;
                    System.out.print( i + "+" + (a - i));
                }
                else {
                    System.out.print( ", " + i + "+" + (a - i));
                }
            }
        }
    }
}

