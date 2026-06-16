package Day_19;

public class DiagSum {
    public static void main(String[] args) {
         int[][] matA = {  
             {2 , 5 , 4},
             {3 , 7 , 0}, 
             {1 , 6 , 8}
                         };
         int row = matA.length;
        int cols = matA[0].length; 
        int sum = 0; 
        for(int i = 0;i < row;i++) {
            for(int j = 0;j < cols;j++) {
                if(i == j) {
                    sum += matA[i][j];
                }
                else {
                    continue;
                }
            }
        }
        System.out.println("Sum of diagonal is:" + sum);
        }
    }
