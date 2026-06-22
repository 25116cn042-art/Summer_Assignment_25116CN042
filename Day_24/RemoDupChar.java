package Day_24;

public class RemoDupChar {
    public static void main(String[] args) {
        String str = "paragraph";
        StringBuilder unique = new StringBuilder();
       boolean[] seen = new boolean[256];
       for(int i = 0;i<str.length();i++) {
        char ch = str.charAt(i);
        if(!seen[ch]) {
            unique.append(ch);  
                seen[ch] = true;      
            }
        }
        System.out.println("After Removing Duplicates: " + unique.toString());
    }
}
