package Day_25;

import java.util.Arrays;

public class SortName {
    public static void main(String[] args) {
        String[] names = {"ganesh" , "shiv" , "parvati"};
        Arrays.sort(names); 
        System.out.println("Alphabetical order :" + Arrays.toString(names));
    }
}
