// EX 1.6 Write a program to check whether the sequence of numbers 1, 2, 3 appears in a given array of integers somewhere.
// Write a program to check whether the sequence of numbers 1, 2, 3 appears in a given array of integers somewhere. 

// Example
// Input:
//     5
//     1 1 2 3 1
// Output: 1
// Please note that:
//     5 as array size
//     1 1 2 3 1 as array 

import java.util.Scanner;

/**
 * array2
 */
public class Main {
    public static boolean test(int[] a) {
        for (int i = 0; i < a.length-2 ; i++) {
            if (a[i] == 1 && a[i + 1] == 2 && a[i + i] == 3) {
                return true;
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
        if (test(a)) {
            System.out.print(0);
        } else {
            System.out.print(1);
        }
    }
}



