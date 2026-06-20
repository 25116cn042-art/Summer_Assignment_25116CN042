package Day_23;

public class MaxOccChar {
    public static void main(String[] args) {
        String name = "paragraph";
        char[] ch = name.toCharArray();
        int count = 0;
        int maxCount = 0;
        char maxChar = ' ';
        
        for (int i = 0; i < ch.length; i++) {
            count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch[i];
            }
        }
        System.out.println("Maximum occurring character is: " + maxChar + " (" + maxCount + " times)");
    }
}
