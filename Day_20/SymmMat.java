package Day_20;

public class SymmMat {
    public static void main(String[] args) {
        int[][] matA = {  
             {2 , 1 , 4},
             {5 , 7 , 0}, 
             {4 , 0 , 8}
                         };
        int row = matA.length;
        int cols = matA[0].length;       
        boolean symmetric = true;
        for(int i = 0; i < row ; i++) {
            for(int j = 0; j < cols; j++) {
                if(matA[i][j] != matA[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if(symmetric) {
            System.out.println("Matrix is symmetric.");
        } else {
            System.out.println("Matrix is not symmetric.");
        }
    }
}
