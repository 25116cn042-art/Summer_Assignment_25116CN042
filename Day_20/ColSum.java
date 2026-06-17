package Day_20;

public class ColSum {
    public static void main(String[] args) {
        int[][] matA = {  
             {2 , 1 , 4},
             {5 , 7 , 0}, 
             {3 , 9 , 8}
                         };
        int row = matA.length;
        int cols = matA[0].length;  
        for(int j = 0;j < cols; j++) {
            int sum = 0;
         for(int i = 0; i < row ; i++) {
            sum += matA[i][j];
         }
         System.out.println("Sum of cols " + j + " is:" + sum);
         }                
    }
}
