package Day_18;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr= {6,3,7,9,1,2,4};
        int target = 9;
        int low = 0;
        int high = arr.length - 1;
        int targetindex = -1;
        while(low <= high) {
            int mid = (low + high)/2;
        if(arr[mid] == target) {
            targetindex = mid;
            break;
        }
        else if(arr[mid] < target) {
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
    if(targetindex!= -1) {
        System.out.println("Element found at index: " + targetindex);
    }else {
    System.out.println("Element not found in array.");
    }
}
}
