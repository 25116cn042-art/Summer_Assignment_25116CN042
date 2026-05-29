public class MulTab {
     public static void main(String[] args) {
        int n = 4; 
        System.out.println("Multiplication table for " + n + ":");
        printMulTab(n, 1); 
    }

    public static void printMulTab(int n, int i) {
        if (i > 10) {
            return ; 
        }
        System.out.println(n + " x " + i + " = " + (n * i)); 
        printMulTab(n, i + 1); 
    
    } 
}
