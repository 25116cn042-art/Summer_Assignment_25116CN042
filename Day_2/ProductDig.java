package Day_2;

public class ProductDig {
     public static void main(String[] arg) {
        int n= 73;
        int product=productDig(n);
        System.out.println("product of digits of "+ n +" is :"+ product);
    }

    public static int productDig(int n) {
        if(n < 10) {
            return n;
        }
        return (n % 10) * productDig(n / 10);
    }

}
