class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] ans = new int[row][col];
        int INF = 10000;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0)
                    continue;
                int top = i>0 ? ans[i-1][j] : INF;
                int left = j>0 ? ans[i][j-1] : INF;
                ans[i][j] = 1+Math.min(top,left);
            }
        }

        for(int i=row-1; i>=0; i--){
            for(int j=col-1;j>=0;j--){
                if(mat[i][j]==0)
                    continue;
                int bottom = i<row-1 ? ans[i+1][j] : INF;
                int right = j<col-1 ? ans[i][j+1] : INF;
                ans[i][j] = Math.min(ans[i][j], 1+Math.min(bottom,right));
            }
        }
        return ans;
    }
}
