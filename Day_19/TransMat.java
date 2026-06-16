package Day_19;

public class TransMat {
    public static void main(String[] args) {
        int[][] matA = {  
             {2 , 5 , 4},
             {3 , 7 , 6}, 
             {4 , 6 , 8}
                         };
        int row = matA.length;
        int cols = matA[0].length;  
        int[][] transMat = new int[cols][row];
        for(int i = 0;i < row;i++) {
            for(int j = 0;j < cols;j++) {
                transMat[j][i] = matA[i][j];
            }
        }
        System.out.println("transpose of matrix is:");
        for(int i = 0;i < row;i++) {
            for(int j = 0;j < cols;j++) {
                System.out.print(transMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
