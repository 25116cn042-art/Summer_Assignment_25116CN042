package Day_22;

public class CharFreq {
    public static void main(String[] args) {
        String name = "ganesha";
        int count =0;
        char target = 'a';
        char[] ch = name.toCharArray();
        for(int i =0;i < ch.length;i++) {
            if(ch[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is:" + count );
    }
}
