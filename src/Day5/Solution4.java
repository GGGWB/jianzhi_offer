package Day5;

public class Solution4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target){
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] < target){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }
}

