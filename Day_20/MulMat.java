package Day_20;

public class MulMat {
    public static void main(String[] args) {
         int[][] matA = {  
             {2 , 5 , 4},
             {3 , 7 , 0}, 
             {1 , 6 , 8}
                         };
         int[][] matB = {   
            {8 , 0 , 3},
            {4 , 1 , 9},
            {6 , 2 , 7}
                        }; 
        int row = matA.length;
        int cols = matA[0].length;
        int row1 = matB.length;
        int cols1 = matB[0].length;
        if(cols != row1) {
            System.out.println("Matrices does not exist.");
            return;
        }
        int[][] Mul = new int[row][cols1];
        for(int i = 0;i < row;i++) {
            for(int j = 0;j < cols1;j++) {
                for(int k = 0;k< cols;k++) {
                    Mul[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        System.out.println("Matrices on multiplication:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < cols1; j++) {
                System.out.print(Mul[i][j] + " ");
            }
            System.out.println();
    }
}
}
