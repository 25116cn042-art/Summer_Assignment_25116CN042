package Day_13;

public class SumAverArray {
    public static void main(String[] args) {
        int num[] = new int[4];
        num[0] = 3;
        num[1] = 6;
        num[2] = 9;
        num[3] = 1;
        int sum  = 0;
        double average;
        for(int i = 0; i < 4;i++) {
            sum += num[i];
        }
            average = sum / 4;
        System.out.print("the sum and average is:" + sum + " and " + average );
    }
}
