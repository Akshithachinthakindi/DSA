import java.util.ArrayList;
import java.util.List;

public class IntersectionSort {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {0,2,4,6,8};

        // List to store intersection values
        List<Integer> result = new ArrayList<>();

        int FirstArr = 0;
        int SecondArr = 0;

        while (FirstArr < arr1.length && SecondArr < arr2.length) {

            // Eliminating Duplicates

            while (FirstArr > 0 && FirstArr < arr1.length && arr1[FirstArr] == arr1[FirstArr-1]) {
                FirstArr++;
            }
            while (SecondArr > 0 && SecondArr < arr2.length && arr2[SecondArr] == arr2[SecondArr-1]) {
                SecondArr++;
            }

            // If one of the array exhausts

            if (FirstArr > arr1.length || SecondArr > arr2.length) {
                break;
            }

            // COMPARISION
            if (arr1[FirstArr] < arr2[SecondArr]) {
                FirstArr++;
            } else if (arr1[FirstArr] > arr2[SecondArr]) {
                SecondArr++;
            }
            else {
                result.add(arr1[FirstArr]);
                FirstArr++;
                SecondArr++;
            }
        }
        System.out.print(result);
    }
}
















