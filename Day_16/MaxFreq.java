package Day_16;

public class MaxFreq {
    public static void main(String[] args) {
        int arr[] = {4,6,2,6,2,8,2,9};
        int maxElement = arr[0];
        int maxCount = 0;
        for(int i = 0;i < arr.length;i++) {
            int currentEle = arr[i];
            int currentcount = 0;
            for(int j = 0; j < arr.length;j++) {
                if(arr[j] == currentEle) {
                    currentcount++;
                }
            }
            if(currentcount > maxCount) {
                maxElement = currentEle;
                maxCount = currentcount;
            }
        }
        System.out.println("The element of maximum frequency is:" + maxElement);
    }
}
