package Day_22;

public class Removespace {
    public static void main(String[] args) {
        String name = "the re are";
        StringBuilder  cleanText = new StringBuilder();
        for(int i = 0;i<name.length();i++) {
            char ch = name.charAt(i);
         if(ch != ' ') {
           cleanText.append(ch);
        }
        }
        String result = cleanText.toString();
        System.out.println("Modified name is:" + result);
    }
}
