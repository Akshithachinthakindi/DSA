import java.util.Scanner;
public class NegElArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        System.out.print("Enter the elements of array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int left = 0;
        int right = n-1;

        while (left <= right) {

            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            }
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        System.out.print("Array after sorting : ");
        for (int m = 0; m < n; m++) {
            System.out.print(arr[m] + " ");
        }
    }
}
// We can use Arrays.sort() and quick.sort tho solve this ques but the won't give us optimized solution
// Hence we are solving it by using

// 2 POINTERS METHOD
// TC : O(n)
// SC : O(1)