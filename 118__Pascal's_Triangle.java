class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    l.add(1);
                else{
                    int sum = ls.get(i-1).get(j-1)+ls.get(i-1).get(j);
                    l.add(sum);
                }
            }
            ls.add(l);
        }
        return ls;
    }
}
