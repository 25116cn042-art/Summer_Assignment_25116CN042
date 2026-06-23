package Day_25;

import java.util.Arrays;

public class SortWordLen {
    public static void main(String[] args) {
         String[] names = {"ganesh" , "shiv" , "parvati"};
         Arrays.sort(names ,(a,b) -> Integer.compare(a.length(), b.length()) );
         System.out.println("Sorted names :" + Arrays.toString(names));
    }
}
