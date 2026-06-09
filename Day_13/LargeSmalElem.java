package Day_13;

public class LargeSmalElem {
    public static void main(String[] args) {
        int num[] = new int[4];
        num[0] = 3;
        num[1] = 9;
        num[2] = 6;
        num[3] = 1;
        int largest = num[0];
        int smallest = num[0];
        for(int i = 1;i<4;i++) {
            if(num[i] > largest) {
               largest = num[i];
            }
            if(num[i] < smallest) {
                smallest = num[i];
    }
}
        System.out.println("largest and smallest are:" + largest + " and " +smallest);
}
}
