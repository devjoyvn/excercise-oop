// EX 1.8 Write a program to find k largest even number in an array
// Write a program to find k largest even number in an array with size of n.

// Example
// Input: 
//     2
//     8
//     4 5 9 12 9 22 45 7
// Output:
//     22 12
// Please note that:
// 2 as k
// 8 as n
// 4 5 9 12 9 22 45 7 as array

import java.util.PriorityQueue;
import java.util.Scanner;

class GFG {

    static void kLargest(int a[], int l, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < l; i++) {
            if (a[i] % 2 == 0) {
                pq.add(a[i]);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int l = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        kLargest(a, l, k);

    }
}

