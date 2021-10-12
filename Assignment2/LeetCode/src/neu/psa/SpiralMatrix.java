package neu.psa;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralMatrix(int[][] matrix) {
        ArrayList result = new ArrayList();
        for(int i = 0; i < matrix[0].length; i++){
            result.add(matrix[0][i]);
        }
        for( int j = 1; j < matrix.length; j++){
            result.add(matrix[j][matrix[0].length - 1]);
        }
        boolean flag = false;
        for( int k = matrix.length - 1; k > 0 ; k--){
            if (flag == false){
                for(int l = matrix[0].length - 2; l >= 0; l--){
                    result.add(matrix[k][l]);
                }
                flag = true;
            }
            else{
                for(int l = 0 ; l <= matrix[0].length - 2; l++){
                    result.add(matrix[k][l]);
                }
                flag = false;
            }
        }
        return result;
    }
}
