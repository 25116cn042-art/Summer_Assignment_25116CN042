package Day_16;

public class PairSum {
    public  static void main(String[] args) {
        int arr[] = {4,5,7,9,2,};
        int sum = 17;
        boolean found = false;
        for(int i = 0; i < arr.length;i++) {
            for(int j = i + 1; j < arr.length;j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.println("Pair found:" + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("Pair not found.");
        }
    }
}
