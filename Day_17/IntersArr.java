package Day_17;

public class IntersArr {
    public static void main(String[] args) {
        int[] arr1 = {3,5,7};
        int[] arr2 = {1,2,3,5};
        int dup = 0;
        for(int i = 0; i < arr1.length;i++) {
            for(int j = 0;j< arr2.length;j++) {
                if(arr1[i] == arr2[j]) {
                    dup++;
                    break;
                }
            }
        }
        int[] arr = new int[dup];
        int position = 0;
        for(int j = 0;j < arr2.length; j++) {
            for(int i = 0;i < arr1.length;i++) {
                if(arr2[j] == arr1[i]) {
                    arr[position++] = arr2[j];
                    break;
                }
            }
        }
         System.out.println("Intersection array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
