import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of an Array: ");
        int a = input.nextInt();

        int arr[] = new int[a];
        System.out.print("Enter the elements of Array: ");

        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();
        }

        //System.out.print("Entered array is: ");
        //System.out.print(arr[a]+" ");

        int temp, start = 0, end = a-1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed Array is: ");

        for (int j = 0; j < a; j++) {
            System.out.print(arr[j]+ " ");
        }
    }
}
