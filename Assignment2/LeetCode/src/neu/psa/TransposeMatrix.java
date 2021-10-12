package neu.psa;

public class TransposeMatrix {
    public int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i = 0; i< matrix[0].length; i++){
            for (int j = 0; j < matrix.length ; j++){
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
