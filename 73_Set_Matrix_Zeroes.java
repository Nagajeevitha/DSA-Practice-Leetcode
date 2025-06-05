class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> lls = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col; j++){
                if(matrix[i][j]==0){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(i);
                    ls.add(j);
                    lls.add(ls);
                }
            }
       }

       for(List<Integer> ls : lls){
            for(int i=0;i<row;i++)
                matrix[i][ls.get(1)]=0;
            for(int j=0;j<col;j++)
                matrix[ls.get(0)][j]=0;
       }
    }
}
