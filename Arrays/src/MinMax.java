import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        //int[] arr = {11, 22, 33, 44, 55, 66};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of Array: ");

        for (int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        FindMinMax(arr);
    }

    static void FindMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Value of the Array is: " + min);
        System.out.println("Maximum Value of the Array is: " + max);
    }
}
