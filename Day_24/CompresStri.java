package Day_24;

public class CompresStri {
    public static void main(String[] args) {
        String str = "gaaaaeee"; 
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                 compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        String result = compressed.toString();
        System.out.println("Compressed String: " + result);
    }
}
