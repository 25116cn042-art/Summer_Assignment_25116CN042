package Day_15;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {2,6,0,5,0,8};
        System.out.println("Original array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int count = 0;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
            while(count <arr.length) {
                arr[count] = 0;
                count++;
            }
             System.out.println("new array :");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
