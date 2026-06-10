package Day_14;

public class DupArray {
    public static void main(String[] args) {
        int arr[] = {4,6,8,4,3,5,8};
        
        System.out.println("Duplicate elements in the given array: ");
        
        for (int i = 0; i < arr.length; i++) {
        
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    break; 
    } 
}
        }
    }
}
