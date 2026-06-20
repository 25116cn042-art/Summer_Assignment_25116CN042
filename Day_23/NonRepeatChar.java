package Day_23;

public class NonRepeatChar {
    public static void main(String[] args) {
        String name = "anesha";
        char[] ch = name.toCharArray();
        System.out.println("First non repeating character is:");
        for(int i = 0;i < ch.length;i++) {
            boolean isrepeating = false;
            for(int j = 0; j < ch.length;j++) {
                if(ch[i] == ch[j] && i != j) {  
                   isrepeating = true;
                   break;
                }
            }
            if(!isrepeating) {
                System.out.println(ch[i]);
                return;
            }
        }
    }
}
