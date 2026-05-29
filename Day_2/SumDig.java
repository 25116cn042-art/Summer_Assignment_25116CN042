package Day_2;

public class SumDig {
     public static void main(String[] args) {
        int n= 324;
        int sum= sumDig(n);
        System.out.println("the sum of digit of "+ n +" is :"+ sum );
    }

    public static int sumDig(int n) {
        if(n < 10) {
            return n;
        }
        return (n % 10) + sumDig(n / 10);
    }

}
