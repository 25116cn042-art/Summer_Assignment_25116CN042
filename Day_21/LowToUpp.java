package Day_21;

public class LowToUpp {
    public static void main(String[] args) {
        String name = "ganesh";
        char[] ch = name.toCharArray();
      for(int i = 0;i < ch.length;i++) {
        char u = Character.toUpperCase(ch[i]);
        System.out.print(u);
      }
    }
}
