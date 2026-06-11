package Day_15;

public class RotateArrRight {
    public static void main(String[] args) {
        int arr[] = {5,7,3,6,9};
        System.out.println("Original array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
         int lastEle = arr[4];
        for(int i =  arr.length - 1;i > 0;i--) {
            arr[i] = arr[i - 1];
    }
     arr[0] = lastEle;
      System.out.print("Rotated right array:");
        for(int num : arr) {
            System.out.print(num + " ");
        
        System.out.println();
    }
}
}
