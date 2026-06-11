package Day_15;

public class RotateArrLeft {
    public static void main(String[] args) {
        int[] arr = {5,6,3,7,2};
        System.out.print("original array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int firstEle = arr[0];
        for(int i = 0;i < arr.length - 1;i++) {
            arr[i] = arr[i +1];
        }
        arr[arr.length - 1] = firstEle;
        System.out.print("Rotated left array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
