package Day_21;

public class CountConsVow {
    public static void main(String[] args) {
        String name = "ganesh";
        char[] ch = name.toCharArray();
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < ch.length; i++) {
            char c = Character.toLowerCase(ch[i]);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonant);
    }
}
