package Day_13;

public class CountEvenOdd {
    public static void main(String[] args) {
        int num[] = new int[4];
        num[0] = 3;
        num[1] = 9;
        num[2] = 6;
        num[3] = 1;
        int count = 0;
        int count1 = 0;
        for(int i = 0; i < 4; i++) {
            if(num[i] % 2 == 0) {
                count++;
            }
            else {
                count1++;
            }
        }
        System.out.println("The even number :" + count);
        System.out.println("The odd number :" + count1);
    }
}
