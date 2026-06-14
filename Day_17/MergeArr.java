package Day_17;

public class MergeArr {
    public static void main(String[] args)  {
        int arr1[] = {3,5,7};
        int arr2[] = {2,4,6,8};
        int position = 0;
        int totallength = arr1.length + arr2.length;
        int[] arr = new int[totallength];
        for(int i = 0 ;i < arr1.length;i++) {
            arr[position] = arr1[i];
            position++;
        }
        for(int i = 0; i < arr2.length;i++) {
            arr[position] = arr2[i];
            position++;
        }
        System.out.println("merged array is:");
        for(int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
