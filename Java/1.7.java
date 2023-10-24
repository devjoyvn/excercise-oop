// EX 1.7 If a number appears three times in a row in an array it is called a triple. Write a program to check if a triple is presents in an array of integers or not.
// If a value appears three times in a row in an array it is called a triple. Write a program to check if a triple is presents in an array of integers or not.

// Example
// Input:
//     7
//     1 1 1 2 2 2 1
// Output:
//     1

// Please note that:

// 7 as array size
// 1 1 1 2 2 2 1 as array
import java.util.Scanner;

/**
 * array2
 */
public class Main{
    public static boolean test(int[] a, int n) {
        for (int i = 0; i < n-1; i++) {
            if (a[i] == a[i + 1] && a[i] == a[i + 2] && a[i + 1] == a[i + 2]) {
                {
                    return true;
                }
            }
        }
        return false;
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        if (test(a, n) == true) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i] + " ");
        // }
    }
}







