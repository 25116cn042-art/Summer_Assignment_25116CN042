package Day_22;

public class CountWord {
    public static void main(String[] args) {
        String sentence = "My name is ganesh";
        int word = 0;
        boolean isword = false;
        for(int i = 0;i < sentence.length();i++) {
            char ch = sentence.charAt(i);
        if(ch != ' ') {
            if(!isword) {
            isword = true;
            word++;
        }
    }
        else {
            isword = false;
        }
    }
        if(isword) {
            System.out.println("Total words are :" + word);
        }
    }
}
