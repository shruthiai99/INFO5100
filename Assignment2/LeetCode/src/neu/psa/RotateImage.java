package neu.psa;

public class RotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);

    }

    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1 ; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reflect(int[][] matrix){
        for(int i = 0; i< matrix.length; i++)
        {
            int low = 0;
            int high = matrix.length - 1;
            while(low < high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
    }
}
