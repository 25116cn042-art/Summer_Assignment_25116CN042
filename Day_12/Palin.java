package Day_12;

public class Palin {
    public static void main(String[] args) {
    int n = 121;
    int temp = n;
    int result = 0;
    while(n > 0) {
      int digit = n % 10;
      result = result*10 + digit;
      n /= 10;
    }
    if(temp == result) {
    System.out.println(temp + " is palindrome.");
}
    else{
        System.out.println(temp + " is  not palindrome.");
}
}
}