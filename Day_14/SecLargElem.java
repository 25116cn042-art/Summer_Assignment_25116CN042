package Day_14;

public class SecLargElem {
    public static int seclargest(int arr[], int largest, int secondlargest) {
        for(int i = 1; i < arr.length;i++) {
            if(arr[i] > largest) {
            secondlargest = largest;
            largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
        }
    }
    return secondlargest;
}
    public static void main(String[] args) {
        int arr[] = {4,6,5,2,8,9};
        int largest = 0;
        int secondlargest = 0;
        int result = seclargest(arr,largest,secondlargest);
        System.out.println("Second largest element is:" + result);
    }
}
