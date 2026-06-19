package Day_22;
public class PalinString {
    public static void main(String[] args) {
        String name = "mom";
        char[] ch = name.toCharArray();
        boolean isPalindrome = true;
       int left = 0;
       int right = ch.length - 1;
       while(left < right) {
        if(ch[left] != ch[right]) {
            isPalindrome = false;
            break;
        }
            left++;
            right--;
       }
       if(isPalindrome) {
       System.out.println(name + " is palindrome.");
       }
       else {
        System.out.println(name + " is not Palindrome.");
       }
    }
}
