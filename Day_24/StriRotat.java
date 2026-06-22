package  Day_24;
public class StriRotat{
    public static void main(String[] args) {
        String str1 = "ganesh";
        String str2 = "eshgan";
        if(str1.length() != str2.length()) {
            System.out.println("str2 is not rotation of str1.");
        }
        String combine = str1 + str1;
        if(combine.contains(str2)) {
            System.out.println("str2 is rotation of str1.");
        }
        else {
             System.out.println("str2 is not rotation of str1.");
        }
    }
}