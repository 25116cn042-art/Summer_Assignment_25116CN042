package Day_17;

public class CommEle {
    public static void main(String[] args) {
        int arr1[] = {3,5,3,8};
        int arr2[] = {1,2,3,3};
        boolean[] visited = new boolean[arr2.length];

        System.out.print("Common Elements are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !visited[j]) {
                    System.out.print(arr1[i] + " ");
                    visited[j] = true; 
                    break; 
                }
            }
        }
        System.out.println();
    }
}
