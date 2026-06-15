package Day_18;

public class DescendArr {
    public static void main(String[] args) {
        int[] arr = {2,4,9,6,1};
        for(int i = 0;i < arr.length-1;i++) {
            for(int j =0;j < arr.length-1;j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Descending order array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
