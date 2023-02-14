import java.util.Scanner;

public class sort012_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {0,1,2,1,2,0,1,0,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
