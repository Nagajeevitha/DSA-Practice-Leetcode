class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int val = -1;
        for(int i=0;i<row;i++){
            if(target<matrix[i][col-1])
            {
                val=i;
                break;
            }
            else if(target==matrix[i][col-1]){
                return true;
            }
        }
        if(val!=-1){
            for(int j=0;j<col;j++){
                if(matrix[val][j]==target)
                    return true;
            }
        }
        return false;
    }
}
