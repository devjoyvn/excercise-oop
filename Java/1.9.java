// EX 1.9 Write a program to separate and sort even and odd numbers of an array of integers
// EX 2.8 Write a program to separate and sort even and odd numbers of an array of integers.
// Put all sorted odd numbers first, and then sorted even numbers.
// Example:
// Input:
//     9
//     0 1 3 4 5 6 7 8 10
// Output:
//     1 3 5 7 0 4 6 8 10

// Please note that:
// 9 as size of array
// 0 1 3 4 5 6 7 8 10 as array

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = 0;
            temp = scanner.nextInt();
            if (temp % 2 != 0) {
                oddNumbers.add(temp);
            } else {
                evenNumbers.add(temp);
            }
        }
        Collections.sort(oddNumbers);
        Collections.sort(evenNumbers);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer i : oddNumbers) {
            numbers.add(i);
        }
        for (Integer i : evenNumbers) {
            numbers.add(i);
        }
        boolean first = true;
        for (Integer i : numbers) {
            if (first) {
                first = false;
                System.out.print(i);
            } else {
                System.out.print(" " + i);
            }
        }
    }
}

