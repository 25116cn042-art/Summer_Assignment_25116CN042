package Day_14;
public class LinearSearch {
    public static int ls(int arr[] , int target) {
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] == target) {
                return i;
            }
        } return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,76,4,67};
        int target = 67;
        int result = ls(arr,target);
        System.out.println("Target is at:" + result);
    }
}