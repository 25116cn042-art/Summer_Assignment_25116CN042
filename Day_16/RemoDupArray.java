package Day_16;
import java.util.Arrays;

public class RemoDupArray {
    public static void main(String[] args) {
        int arr[] = {3,5,3,6};
        int index = 0;
        Arrays.sort(arr);
        for(int i =0;i < arr.length;i++) {
            if(i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            arr[index] = arr[i];
            index++;
        }
        System.out.print("new array:");
        for(int i = 0;i < index;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
