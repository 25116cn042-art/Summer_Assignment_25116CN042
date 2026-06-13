package Day_16;

public class MissNumArray {
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,8,2,7,5};
        int arr1[]= {3,4,8,2,6,5,1};
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1;i < arr.length;i++) {
            sum1 += i;
        }
        for(int i = 1;i < arr1.length;i++) {
            sum2 += i;
        }
        int result = sum1 - sum2;
        System.out.println("Missing number is:" + result);
    }
}
