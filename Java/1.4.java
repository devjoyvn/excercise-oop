// EX 1.4. Write a program which reads a sequence of integers and prints how often each number of this sequence occurs.
// Write a program which reads a sequence of integers and prints how often each number of this sequence occurs.

// Example

// Input: 

// 9

// 1 3 5 7 5 3 7 2 5

// Output: 

// 1(1), 3(2), 5(3), 7(2), 2(1)



// Please note that: 

// 9 as array size

// 1 3 5 7 5 3 7 2 5 as array
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean check = true;
        boolean first = true;
        for (int i = 0; i < arr.length; i++) {
            check = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = false;
                    break;
                }
            }

            if (check == true) {
                int sum = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        sum++;
                    }
                }
                if (first == true) {
                    System.out.print(arr[i] + "(" + sum + ")");
                    first = false;
                } else {
                    System.out.print(", " + arr[i] + "(" + sum + ")");
                }

            }
        }

    }
}

