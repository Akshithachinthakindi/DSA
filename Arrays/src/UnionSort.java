import java.util.ArrayList;
import java.util.List;

public class UnionSort {
    public static <integer> void main(String[] args) {
        int[] a = {4, 5, 6, 7, 8};
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int FirstArr = 0;
        int SecondArr = 0;

        // to store sorted union values in a list
        List<Integer> result = new ArrayList<>();

        while (FirstArr < a.length || SecondArr < b.length) {

            // To Eliminate duplicate values
            while (FirstArr > 0 && FirstArr < a.length && a[FirstArr] == a[FirstArr-1]) {
                FirstArr++;
            }
            while (SecondArr > 0 && SecondArr < a.length && b[SecondArr] == b[SecondArr-1]) {
                SecondArr++;
            }

            // If any one of the arr exhausts (completes)
            if (FirstArr >= a.length) {
                result.add(b[SecondArr]);
                SecondArr++;
                continue;
            }
            if (SecondArr >= b.length) {
                result.add(a[FirstArr]);
                FirstArr++;
                continue;
            }

            // COMPARISION

            if (a[FirstArr] < b[SecondArr]) {
                result.add(a[FirstArr]);
                FirstArr++;
            }
            else if (a[FirstArr] > b[SecondArr]) {
                result.add(b[SecondArr]);
                SecondArr++;
            }
            else {
                result.add(a[FirstArr]);
                FirstArr++;
                SecondArr++;
            }
        }
        System.out.print(result);
    }
}
