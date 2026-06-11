package Day_15;

public class RevArr {
    public static void main(String[] args) {
        int[] arr = {3, 9, 6, 1, 5};

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr [start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}