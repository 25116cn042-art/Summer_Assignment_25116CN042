package Day_19;

public class SubMat {
    public static void main(String[] args) {
         int[][] matA = {  
             {2 , 5 , 4},
             {3 , 7 , 6} 
                         };
        int[][] matB = {   
            {8 , 0 , 3},
            {4 , 1 , 9}
                        }; 
        int row = matA.length;
        int cols = matA[0].length;  
        int sumMat[][] = new int[row][cols];
        for(int i = 0;i < row;i++) {
            for(int j = 0;j < cols;j++) {
                sumMat[i][j] = matA[i][j] -  matB[i][j];
            }
        }
        System.out.println("Matrices on subtraction :");
         for(int i = 0;i < row;i++) {
            for(int j = 0;j < cols;j++)  {
                System.out.print(sumMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
