import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter elements of an array: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int zero = 0;
        int one = 0;
        int two = n-1;

        while (one <= two) {
            if (a[one] == 0) {
                int temp = a[zero];
                a[zero] = a[one];
                a[one] = temp;

                zero++;
                one++;
            }
            else if (a[one] == 1) {
                one++;
            }
            else if (a[one] == 2) {
                int temp = a[two];
                a[two] = a[one];
                a[one] = temp;

                two--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}

//class sorting {
//    public void sort120(int[] nums) {
//        int low = 0;
//        int mid = 0;
//        int high = n-1;
//    }
//}

//  ***********************
// There will an array with random numbers of 0s 1s and 2s arranged randomly.
// 3 Pointer method is the only best method which gives us the tc of O(n) AND sc of O(1).
