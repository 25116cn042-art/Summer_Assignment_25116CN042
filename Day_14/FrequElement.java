package Day_14;

public class FrequElement {
    public static int frequency(int arr[],int target ,int count) {
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == target) {
                count++;
            }
        } return count;
    }
    public static void main(String[] args) {
        int arr[] = {5,8,7,3,8,8,7,6};
        int target = 8;
         int count = 0;
        int result = frequency(arr , target, count);
        System.out.println("Frequnecy of " + target + " is:" + result);
    }
}
