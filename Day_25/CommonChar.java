package Day_25;

public class CommonChar {
    public static void main(String[] args) {
        String name = "ganesh";
        char[] ch = name.toCharArray();
        boolean common = false;
        boolean[] printed = new boolean[256];
        for(int i =0;i < ch.length;i++) {
            for(int j = i+1; j <ch.length;j++) {
                if(ch[i] == ch[j] && !printed[ch[i]]) {
                    System.out.println("Common character: " + ch[i]);
                     printed[ch[i]] = true;
                     common =true;
                    break;
                }
            }
        }
        if(!common) {
            System.out.println("No common characters.");
        }
    }
}
