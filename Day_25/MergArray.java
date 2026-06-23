package Day_25;
import java.util.Arrays;
public class MergArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
    }
}
