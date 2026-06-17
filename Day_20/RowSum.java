package Day_20;

public class RowSum {
    public static void main(String[] args) {
         int[][] matA = {  
             {2 , 1 , 4},
             {5 , 7 , 0}, 
             {3 , 9 , 8}
                         };
        int row = matA.length;
        int cols = matA[0].length;  
         for(int i = 0; i < row ; i++) {
            int sum = 0;
            for(int j = 0; j < cols; j++) {
                sum += matA[i][j];
            }  
            System.out.println("sum of " + i + " row is:" +sum); 
        }            
    }
}
