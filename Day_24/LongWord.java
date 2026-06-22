package Day_24;

public class LongWord {
    public static void main(String[] args) {
        String sentence = "my mother is brave";
        int longest = 0;
        int current = 0;
        int maxstart = 0;
        int maxend = 0;
        System.out.println("Longest word in string is:");
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == ' ') {
                if (current > longest) {
                    longest = current;
                    maxstart = i - current;
                    maxend = i;
                }
                current = 0;
            } else {
                current++;
            }
        }
        String longestword = sentence.substring(maxstart,maxend);
        System.out.println(longestword);
        System.out.println("( " + longest + " )");
    }
}
