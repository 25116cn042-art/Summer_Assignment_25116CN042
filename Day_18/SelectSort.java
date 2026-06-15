package Day_18;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4,3,8,6};
        for(int i = 0;i < arr.length - 1;i++) {
            int minindex = i;
            for(int j =i + 1;j < arr.length;j++) {
                if(arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
             int temp = arr[minindex];
             arr[minindex] = arr[i ];
             arr[i ] = temp; 
        }
        System.out.println("Sorted array by selection sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
