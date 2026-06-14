package Day_17;

public class UnionArr {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 6};
        int[] arr2 = {1, 2, 3};
        int dup = 0;
        for (int j = 0; j < arr2.length; j++) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[j] == arr1[i]) {
                    dup++;
                    break;
                }
            }
        }
        int totalLength = arr1.length + arr2.length - dup;
        int[] arr = new int[totalLength];
        int position = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr[position++] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            boolean found = false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                arr[position++] = arr2[j];
            }
        }
        System.out.println("Union array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
