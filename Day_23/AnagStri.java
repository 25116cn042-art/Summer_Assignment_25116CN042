package Day_23;

import java.util.Arrays;

public class AnagStri {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if(str1.length() != str2.length())  {
            System.out.println("String is not anagram.");
        }
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean isAnagram = Arrays.equals(ch1,ch2);
        if(isAnagram) {
            System.out.println("String is anagram.");
        }
        else {
            System.out.println("String is not anagram.");
        }
    }
}
