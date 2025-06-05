class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int top=0, left =0, bottom=row-1, right=col-1;
        while(top<=bottom && left<=right){
            int j=left;
            while(j<=right){
                ls.add(matrix[top][j++]);
            }
            j=top+1;
            while(j<=bottom){
                ls.add(matrix[j++][right]);
            }
            if(top<bottom){
                j=right-1;
                while(j>=left){
                    ls.add(matrix[bottom][j--]);
                }
            }
            if(left<right){
                j=bottom-1;
                while(j>top){
                    ls.add(matrix[j--][left]);
                }
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        return ls;
    }
}
