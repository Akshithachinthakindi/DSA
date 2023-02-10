import java.util.*;
import java.lang.*;
import java.io.*;
public class KthMinMax {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //System.out.print("Enter t: ");
        //int t = in.nextInt();
        int n, k;

        //while (t != 0) {
            System.out.print("Enter the size of an Array: ");
            n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Array elements: ");
                arr[i] = in.nextInt();
            }
            System.out.print("Enter the value of k: ");
            k = in.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i=0;i<n;i++) {
                pq.add(arr[i]);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
            System.out.println("The Smallest Kth Element is: " + pq.peek());
      //  }
        PriorityQueue<Integer> pqq = new PriorityQueue<>();

        for (int j=0;j<n;j++) {
            pqq.add(arr[j]);
            if (pqq.size() > k) {
                pqq.poll();
            }
        }
        System.out.println("The Largest Kth Element is: " + pqq.peek());
    }
}

// Ques : find the Min and Max of the Kth element in an Array.

// we solve this using 3 methods
//********SORTING******
// Arrays.sort(arr); //1st method (not a best method) tc : O(nlogn)

// ******HEAP******
// Using priority queues, Min and Max heaps  // preffered method tc : O(nlogk)

//Largest -- Min heap
//Smallest -- Max heap

// *****QUICK SORT******

